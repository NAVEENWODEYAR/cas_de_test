package com.junit.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

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
public class Student {

	private Long stId;
	
	private String stName;
	
	private String stClass;
	
	private String stPhone;
	
	private Double stMarks;
}
