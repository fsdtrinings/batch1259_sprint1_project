package com.training.app.repository.instructor;

import com.training.app.entity.Course;
import com.training.app.entity.Instructor;

public class CustomInstructorRepositoryImpl implements CustomInstructorRepository{

	
	
	@Override
	public Instructor updateCourseByInstructor(Instructor instructor, Course course) {
		
		instructor.setCourse(course);
		return instructor;
	}

	
}
