package com.training.app.dto;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDetailedDTO {

	private int stuId;
	private String studentName;
	private String studentAddress;
	private String registeredContactDetails;
	private String category;
	private String courseEnrolled;
}
