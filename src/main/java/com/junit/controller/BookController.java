package com.junit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.junit.dto.BookDto;
import com.junit.service.BookService;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.controller
 */

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	 @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello, World!");
    }
	 
	 @GetMapping("/custom")
	    public ResponseEntity<String> getCustom() {
	        return ResponseEntity.status(HttpStatus.CREATED)
	                             .header("Custom-Header", "CustomValue")
	                             .body("Custom Response");
	    }
	 
	@GetMapping("/test")
	public ResponseEntity<Object> testEndPoint(){
		return ResponseEntity.ok("Welcome to BOOK APPLICARION");
	}
	
	@GetMapping("/listing")
	public ResponseEntity<Object> getBooksList(){
		return ResponseEntity.ok(bookService.getBooksListing());
	}
	
	@GetMapping("/get-byId/{bookId}")
	public ResponseEntity<Object> getBookById(@PathVariable Long bookId){
		return ResponseEntity.ok(bookService.getBookById(bookId));
	}
	
	@PostMapping("/add")
	public ResponseEntity<Object> addBookDetails(@RequestBody BookDto request){
		return ResponseEntity.ok(bookService.addBookDetails(request));
	}
	
	@PutMapping("/update/{bookId}")
	public ResponseEntity<Object> updateBookDetails(@PathVariable Long bookId, @RequestBody BookDto request){
		return ResponseEntity.ok(bookService.updateBookDetails(bookId,request));
	}
	
	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<Object> deleteBookDetails(@PathVariable Long bookId){
		return ResponseEntity.ok(bookService.deleteBookDetails(bookId));
	}
	
	

}
