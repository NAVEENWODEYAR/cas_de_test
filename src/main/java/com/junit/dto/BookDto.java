package com.junit.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.junit.entity.Book;

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
	
	private Long bookId;
	
	private String bkName;
	
	private String bkAuthor;
	
	private Double bkPrice;
	
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
