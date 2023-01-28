package com.training.app.repository.instructor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.app.entity.Course;
import com.training.app.entity.Instructor;

@Repository
public interface InstructorRepository extends 
        JpaRepository<Instructor,Integer>,CustomInstructorRepository
{

	
	
}//end interface
