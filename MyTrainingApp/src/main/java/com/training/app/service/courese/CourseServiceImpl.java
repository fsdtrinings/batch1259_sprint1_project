package com.training.app.service.courese;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.app.entity.Course;
import com.training.app.repository.course.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public Course getCourseById(int id) {
		
		return courseRepository.getReferenceById(id);
	}

	@Override
	public List<Course> getAllCourses() {
		
		return courseRepository.findAll();
	}
	
	
	
	@Override
	public Course addCourse(Course course) {
	
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseByName(String name) {
		
		return courseRepository.getCourseByCourseName(name);
	}

	

	@Override
	public List<Course> getCoursesByCategory(String category) {
		
		return courseRepository.getCourseByCategory(category);
	}

	
	
}







