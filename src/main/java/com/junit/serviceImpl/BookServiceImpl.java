package com.junit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.entity.Book;
import com.junit.entity.dto.ApiResponse;
import com.junit.entity.dto.BookDto;
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
	public ApiResponse<String> getBooksListing() {
		List<Book> bookList = bookRepository.findAll();
		return null;
	}

	@Override
	public ApiResponse<String> getBookById(Long bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse<String> addBookDetails(BookDto request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse<String> updateBookDetails(Long bookId, BookDto request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse<String> deleteBookDetails(Long bookId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
