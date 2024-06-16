
package com.junit.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.entity
 */

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

}
