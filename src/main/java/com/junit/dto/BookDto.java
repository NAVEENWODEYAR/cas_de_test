package com.junit.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.junit.entity.Book;

import jakarta.persistence.Column;
import lombok.*;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.entity.dto
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude
public class BookDto {
	
	@Column(name = "BOOK_ID")
	private Long bookId;
	
	@Column(name = "BOOK_NAME")
	private String bkName;
	
	@Column(name = "BOOK_AUTHOR")
	private String bkAuthor;
	
	@Column(name = "BOOK_PRICE")
	private Double bkPrice;
	
	@Column(name = "BOOK_RATING")
	private Integer bkRating;

	public interface Create{}
	
	public interface Update{}

	
	public static BookDto build(Book book) {
		return new BookDto(
				book.getBookId(),
				book.getBkAuthor(),
				book.getBkName(),
				book.getBkPrice(),
				book.getBkRating());
	}
}
