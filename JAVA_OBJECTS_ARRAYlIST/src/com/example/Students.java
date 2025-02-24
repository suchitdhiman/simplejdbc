package com.example;

public class Students {
	
	private String name;
	private String department;
	private int id;
	
	public Students(String name, String dipartment, int id) {
		super();
		this.name = name;
		this.department = dipartment;
		this.id = id;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
