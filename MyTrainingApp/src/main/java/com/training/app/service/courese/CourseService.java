package com.training.app.service.courese;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.app.entity.Course;

@Service
public interface CourseService {

	public Course addCourse(Course course);
	public List<Course> getAllCourses();
	
	// ----- specific methods , because of property name
	public List<Course> getCoursesByCategory(String category);
	public Course getCourseByName(String name);
	public Course getCourseById(int id);
	
	
	
}
