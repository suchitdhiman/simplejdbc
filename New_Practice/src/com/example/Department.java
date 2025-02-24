package com.example;

import java.util.List;


public class Department {
	
	private List<Students> students;
	private String name;
	
	Department(String name, List<Students> students){
		this.name = name;
		this.students = students;
	}
	
	Department(){
		super();
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
