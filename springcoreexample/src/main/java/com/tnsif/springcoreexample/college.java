package com.tnsif.springcoreexample;

public class college {

	private Student student;
	
	public college() {
		System.out.println("College object created.....");
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	public void show() {
		
		System.out.println("Welcome to college");
		student.display();
	}
	
}
