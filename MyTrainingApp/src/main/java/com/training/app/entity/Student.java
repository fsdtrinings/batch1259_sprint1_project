package com.training.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stuId;
	private String stuName;
	
	@Embedded
	private Profile profile;
	
	
	
	public Student(String stuName) {
		super();
		this.stuName = stuName;
	}

	
	public Student(String stuName, Profile profile) {
		super();
		this.stuName = stuName;
		this.profile = profile;
	}



	

}
