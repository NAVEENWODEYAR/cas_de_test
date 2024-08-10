package com.junit.service.impl;
/**
 * @author Naveen K Wodeyar
 * @date 10-Aug-2024
 * @apiDoc com.junit.service.impl
 */
import com.junit.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.junit.dto.BookDto;
import com.junit.entity.Book;
import com.junit.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getBooksListing() {
        // Implementation here
    	return null;
    }

    @Override
    public BookDto getBookById(Long bookId) {
        // Implementation here
    	return null;
    }

    @Override
    public String addBookDetails(BookDto request) {
        // Implementation here
    	return null;
    }

    @Override
    public String updateBookDetails(Long bookId, BookDto request) {
        // Implementation here
    	return null;
    }

    @Override
    public String deleteBookDetails(Long bookId) {
        // Implementation here
    	return null;
    }
}
