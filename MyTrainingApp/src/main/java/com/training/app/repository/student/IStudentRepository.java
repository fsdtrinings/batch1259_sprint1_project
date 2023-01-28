package com.training.app.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.app.entity.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{

}
