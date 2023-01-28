package com.training.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AppTrainer")
@Data
@NoArgsConstructor
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int insCode;
	@Column(name="InstructorName")
	private String insName;
	private int salary;
	private String domain;
	
	@Embedded
	@Column(nullable = true)
	private Profile profile;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Course course;

	public Instructor(String insName, int salary, String domain) {
		super();
		this.insName = insName;
		this.salary = salary;
		this.domain = domain;
	}

	public Instructor(String insName, int salary, String domain, Profile profile) {
		super();
		this.insName = insName;
		this.salary = salary;
		this.domain = domain;
		this.profile = profile;
	}
	
	
	
}
