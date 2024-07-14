package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entity.Employee;

@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
