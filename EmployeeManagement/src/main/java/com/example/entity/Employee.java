package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employe")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long employeeID;
	
	@Column(name = "first_name")
	private String employeeFirstName;
	@Column(name = "last_name")
	private String employeeLastName;
	@Column(name = "email_id")
	private String employeeEmail;
	@Column(name = "department")
	private String employeeDepartment;
	@Column(name = "age")
	private String employeeAge;
	@Column(name = "address")
	private String address;
	
	// constructor using super class
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}

	public Employee(long employeeID, String employeeFirstName, String employeeLastName, String employeeEmail,
			String employeeDepartment, String employeeAge, String address) {
		super();
		this.employeeID = employeeID;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeEmail = employeeEmail;
		this.employeeDepartment = employeeDepartment;
		this.employeeAge = employeeAge;
		this.address = address;
	}

	public Employee(String employeeFirstName, String employeeLastName, String employeeEmail, String employeeDepartment,
			String employeeAge, String address) {
		super();
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeEmail = employeeEmail;
		this.employeeDepartment = employeeDepartment;
		this.employeeAge = employeeAge;
		this.address = address;
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
