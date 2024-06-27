package com.junit.serviceImpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
	public BookDto getBookById(Long bookId) {
		Book bookDto = bookRepository.findById(bookId).orElseThrow();
		return null;
	}

	@Override
	public String addBookDetails(BookDto request) {
		Book book = new Book(request);
		bookRepository.save(book);
		return "Book added successfully,";
	}

	@Override
	public String updateBookDetails(Long bookId, BookDto request) {
		Book book = bookRepository.findById(bookId).orElseThrow();
		BeanUtils.copyProperties(request, book);
		bookRepository.save(book);
		return "Updated successfully,";
	}

	@Override
	public String deleteBookDetails(Long bookId) {
		bookRepository.deleteById(bookId);
		return "deleted sucessfully,";
	}
}
