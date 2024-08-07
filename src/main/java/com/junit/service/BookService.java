package com.junit.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.junit.dto.BookDto;
import com.junit.entity.Book;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.strategy
 */
@Service
public interface BookService {

	List<Book> getBooksListing();

	BookDto getBookById(Long bookId);

	String addBookDetails(BookDto request);

	String updateBookDetails(Long bookId, BookDto request);

	String deleteBookDetails(Long bookId);

}
