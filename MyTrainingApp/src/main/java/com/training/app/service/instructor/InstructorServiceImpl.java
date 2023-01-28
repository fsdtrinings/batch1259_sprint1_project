package com.training.app.service.instructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.app.entity.Course;
import com.training.app.entity.Instructor;
import com.training.app.repository.course.CourseRepository;
import com.training.app.repository.instructor.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService{

	@Autowired
	InstructorRepository instructorRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	
	@Override
	public Instructor registerTrainer(Instructor instructor) {
		return instructorRepository.save(instructor);
	}

	@Override
	public List<Instructor> getAllTrainer() {
		return instructorRepository.findAll(); 
	}

	@Override
	public Instructor updateCourse(int instructorCode,int courseId) {
		
		// First Step : extract already saved instructor & course from DB
		
		Instructor savedInstructor = instructorRepository.getReferenceById(instructorCode);
		Course savedCourse = courseRepository.getReferenceById(courseId);
		
		// if both instructor & course is available in database
		if(savedInstructor != null & savedCourse != null) 
		{
			Instructor updatedInstructor = instructorRepository.updateCourseByInstructor(savedInstructor, savedCourse);
			instructorRepository.save(updatedInstructor); // if data is already saved then hibernate calls update query in background
			return updatedInstructor;
		}
		
		else return null;
		
		
	}
	
	
}

















