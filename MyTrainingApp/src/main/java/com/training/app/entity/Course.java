package com.training.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // code to generate PK automatically
	private int courseId;
	private String courseName;
	private int duration;
	private String category;
	private String courseOwner;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CourseNumber") // column holds FK value and name of column set through "name attribute"
	private List<Student> students;
	
	public Course(String courseName, int duration, String category, String courseOwner) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.category = category;
		this.courseOwner = courseOwner;
	}
	
	
	
}
