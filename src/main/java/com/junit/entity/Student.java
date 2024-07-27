package com.junit.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

/**
 * @author Naveen K Wodeyar
 * @date 24-Jun-2024
 * @apiDoc com.junit.entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@JsonInclude
@Entity
public class Student {

	@Id
	private Long stId;
	
	private String stName;
	
	private String stClass;
	
	private String stPhone;
	
	private Double stMarks;
}
