package com.training.app.util;

import org.springframework.stereotype.Component;

import com.training.app.dto.StudentResponseDTO;
import com.training.app.dto.StudentResponseDetailedDTO;
import com.training.app.entity.Student;

@Component
public class StudentDTOConvertor {

	
	public StudentResponseDTO getStudentDTO(Student s)
	{
		return new StudentResponseDTO(s.getStuId(), s.getStuName(), "Student Added");
		
		
	}
	
	public StudentResponseDetailedDTO getDetailedStudentDTO(Student s)
	{
		StudentResponseDetailedDTO dto = new StudentResponseDetailedDTO();
		
		dto.setStuId(s.getStuId());
		dto.setStudentName(s.getStuName());
		if(s.getProfile() != null && s.getProfile().getAddress()!=null)
		{
			
			dto.setStudentAddress(s.getProfile().getAddress());
		}
		else dto.setStudentAddress("Not Yet Updated");
		
		
		if(s.getProfile() != null )
		{
			
			String email = s.getProfile().getEmail();
			String phone = s.getProfile().getPhone()+"";
			
			String contact = "";
			
			contact += (!email.isBlank() && !email.equals(" ") )?"[ "+email : "Email Not Updated";
			contact += (!phone.isBlank() && !phone.equals(" ") )?" "+phone+" ]":"Phone Not Updated";
			
			dto.setRegisteredContactDetails(contact);
		}
		else dto.setRegisteredContactDetails("Not Yet Updated");
		
		
		dto.setCategory("Wait for while");
		dto.setCourseEnrolled("Wait for while");
		
		return dto;
		
		
		
		
	}
	
}
