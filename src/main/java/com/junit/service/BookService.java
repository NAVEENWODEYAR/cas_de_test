package com.junit.service;

import org.springframework.stereotype.Service;
import com.junit.entity.dto.ApiResponse;
import com.junit.entity.dto.BookDto;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.strategy
 */
@Service
public interface BookService {

	ApiResponse<String> getBooksListing();

	ApiResponse<String> getBookById(Long bookId);

	ApiResponse<String> addBookDetails(BookDto request);

	ApiResponse<String> updateBookDetails(Long bookId, BookDto request);

	ApiResponse<String> deleteBookDetails(Long bookId);

}
