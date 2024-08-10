package com.junit.entity;

import com.junit.dto.BookDto;

import io.swagger.annotations.ApiModel;
import jakarta.persistence.*;
import lombok.*;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.entity
 */

@ApiModel(description = "Stores the book details,")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TEST_BOOK")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long bookId;
	
	private String bkName;
	
	private String bkAuthor;
	
	private Double bkPrice;
	
	private Integer bkRating;
	
	public Book(BookDto request) {
		this.bookId = request.getBookId();
		this.bkName = request.getBkName();
		this.bkAuthor = request.getBkAuthor();
		this.bkPrice = request.getBkPrice();
		this.bkRating = request.getBkRating();
	
	}

}
