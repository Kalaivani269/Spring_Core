package com.tnsif.springcoretwo;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name="Kalai";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudent() {
		System.out.println("Student Nmae:"+name);
	}
	
}
