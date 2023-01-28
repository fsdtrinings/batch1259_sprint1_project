package com.training.app.util;

import org.springframework.stereotype.Component;

import com.training.app.dto.InstructorDTODefaultResponse;
import com.training.app.entity.Instructor;

@Component
public class InstructorDTOConvertor {

	
	public InstructorDTODefaultResponse convertTo(Instructor instructor)
	{
		
		return new InstructorDTODefaultResponse(instructor.getInsCode(), instructor.getInsName());
	}
}
