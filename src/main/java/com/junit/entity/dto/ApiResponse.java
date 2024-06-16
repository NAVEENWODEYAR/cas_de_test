package com.junit.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.entity.dto
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class ApiResponse<T> {

	private String msg;
	private Boolean status;
	
}
