package com.junit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.junit.dto.BookDto;
import com.junit.service.BookService;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.controller
 */
@Tag(name = "Book_Controller",description = "Books related operations/API's")
@RestController
@RequestMapping("/api/v1/book")
public class BookController {

	public static final Logger log = LoggerFactory.getLogger(BookController.class);
	@Autowired
	private BookService bookService;

	@ApiOperation(value = " ", notes = "Test Endpoint", response = ResponseEntity.class)
	@GetMapping("/hello")
	public ResponseEntity<?> hello() {
		log.info("Inside Test endpoint");
		log.error("Test EndPoint");
		log.debug("Test EndPoint");
		log.trace("Test EndPoint");
		return ResponseEntity.ok("Hello, World!");
	}

	@ApiOperation(value = "String",notes = "Response",response = ResponseEntity.class)
	@GetMapping("/custom")
	public ResponseEntity<String> getCustom() {
		return ResponseEntity.status(HttpStatus.CREATED).header("Custom-Header", "CustomValue").body("Custom Response");
	}

	@GetMapping("/test")
	public ResponseEntity<Object> testEndPoint() {
		log.trace("Test EndPoint");
		log.info("Inside Test endpoint");
		log.warn("Test EndPoint");
		log.debug("Test EndPoint");
		log.trace("Test EndPoint");
		return ResponseEntity.ok("Welcome to BOOK APPLICARION");
	}

	@GetMapping("/listing")
	public ResponseEntity<Object> getBooksList() {
		return ResponseEntity.ok(bookService.getBooksListing());
	}

	@GetMapping("/get-byId/{bookId}")
	public ResponseEntity<Object> getBookById(@PathVariable Long bookId) {
		return ResponseEntity.ok(bookService.getBookById(bookId));
	}

	@PostMapping("/add")
	public ResponseEntity<Object> addBookDetails(@RequestBody BookDto request) {
		return ResponseEntity.ok(bookService.addBookDetails(request));
	}

	@PutMapping("/update/{bookId}")
	public ResponseEntity<Object> updateBookDetails(@PathVariable Long bookId, @RequestBody BookDto request) {
		return ResponseEntity.ok(bookService.updateBookDetails(bookId, request));
	}

	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<Object> deleteBookDetails(@PathVariable Long bookId) {
		return ResponseEntity.ok(bookService.deleteBookDetails(bookId));
	}

}
