package com.junit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.dto.ApiResponse;
import com.junit.dto.BookDto;
import com.junit.entity.Book;
import com.junit.repo.BookRepository;
import com.junit.service.BookService;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.serviceImpl
 */

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getBooksListing() {
		List<Book> bookList = bookRepository.findAll();
		return bookList;
	}

	@Override
	public ApiResponse<String> getBookById(Long bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addBookDetails(BookDto request) {
		Book book = new Book(request);
		bookRepository.save(book);
		return "Book added successfully,";
	}

	@Override
	public ApiResponse<String> updateBookDetails(Long bookId, BookDto request) {
		return null;
	}

	@Override
	public ApiResponse<String> deleteBookDetails(Long bookId) {
		return null;
	}
}
