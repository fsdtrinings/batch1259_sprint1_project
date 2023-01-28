package com.training.app.service.instructor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.app.entity.Course;
import com.training.app.entity.Instructor;

@Service
public interface InstructorService {

	
	public Instructor registerTrainer(Instructor instructor);
	public List<Instructor> getAllTrainer();
	public Instructor updateCourse(int instructorCode,int courseId);
}
