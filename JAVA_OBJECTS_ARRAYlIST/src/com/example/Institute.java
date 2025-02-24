package com.example;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    
    private String name;
    private List<Department> departments;

    public Institute(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public static void main(String[] args) {
        // Create students
        Students student1 = new Students("Suchit", "IT", 101);
        Students student2 = new Students("John", "IT", 102);

        // Create list of students for IT department
        List<Students> itStudents = new ArrayList<>();
        itStudents.add(student1);
        itStudents.add(student2);

        // Create IT department with students
        Department itDepartment = new Department("IT", itStudents);

        // Create institute and add department
        Institute institute = new Institute("Tech Institute");
        institute.addDepartment(itDepartment);

        // Print institute details
        System.out.println("Institute: " + institute.getName());
        for (Department dept : institute.getDepartments()) {
            System.out.println("Department: " + dept.getName());
            for (Students student : dept.getStudents()) {
                System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName() + ", Department: " + student.getDepartment());
            }
        }
    }
}
