package com.employee;

public class EmployeeManagment {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.eID = 01l;
		e1.eName = "suchit";
		e1.age = 24;
		e1.department = "Associate Software Engineer";
		
		e2.eID = 02l;
		e2.eName = "kk";
		e2.age = 21;
		e2.department = "Trainee Associate Software Engineer";
		
		
		
		System.out.println("Name is:\t"+ e1.eName);
		System.out.println("Id is:\t\t"+ e1.eID);
		System.out.println("Age is:\t\t"+ e1.age);
		System.out.println("Department:\t"+ e1.department);
		
		
		System.out.println("Name is:\t"+ e2.eName);
		System.out.println("Id is:\t"+ e2.eID);
		System.out.println("Age is:\t"+ e2.age);
		System.out.println("Department:\t"+ e2.department);

	}

}
