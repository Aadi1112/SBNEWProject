package com.aadi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aadi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
