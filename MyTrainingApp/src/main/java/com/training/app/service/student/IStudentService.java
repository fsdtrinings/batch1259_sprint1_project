package com.training.app.service.student;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.app.entity.Course;
import com.training.app.entity.Student;

@Service
public interface IStudentService {

	public Student addStudent(Student student)throws Exception;
	public List<Student> getAllStudents();
	public Student updateCourseByStudentid(int sid,int cid)throws Exception;
	public Student getStudentById(int sid)throws Exception;
	public Course getCourseByStudentId(int sid) throws Exception;
	
}
