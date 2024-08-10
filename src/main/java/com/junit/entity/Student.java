package com.junit.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

/**
 * @author Naveen K Wodeyar
 * @date 24-Jun-2024
 * @apiDoc com.junit.entity
 */
@ApiModel(description = "Stores the Student details,")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@JsonInclude
@Entity
public class Student {

	@Id
	@ApiModelProperty(notes = "Primary key, which is unique")
	private Long stId;
	
	private String stName;
	
	private String stClass;
	
	@ApiModelProperty(notes = "Unique for each studnet,")
	private String stPhone;
	
	private Double stMarks;
}
