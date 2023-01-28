package com.training.app.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

	private String email;
	private long phone;
	private String address;
	private String cityName;
	
}
