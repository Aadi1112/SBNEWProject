package com.aadi;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.aadi.entity.Employee;
import com.aadi.repo.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpa2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa2Application.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//QBE -> Query By Example
		
//	
		Employee emp=new Employee();
		emp.setEmpName("Ram");
		emp.setEmpGender("Male");//filter
		emp.setDept("Sales");
		emp.setEmpSalary(15000.00);
		
		employeeRepository.save(emp);
//		
//		 Example<Employee> of= Example.of(emp);
//		 
//		 List<Employee> list= employeeRepository.findAll(of);
//		 
//		 list.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
//		Employee employee=new Employee();
//		employee.setEmpName("Aaksh");
//		employee.setEmpGender("Male");
//		employee.setEmpSalary(30000.00);
//		employee.setDept("IT");
//		Employee employee2=new Employee(103, "Neha", 20000.00, "Female", "Sales");
//
//		Employee employee3=new Employee(104, "Rohan", 50000.00, "Male", "Admin");
//
//		Employee employee4=new Employee(105, "Rohit", 60000.00, "Male", "HR");
//		Employee employee5=new Employee(106, "Virat", 15000.00, "Male", "Sales");
//
//		Employee employee6=new Employee(107, "Dhoni", 45000.00, "Male", "IT");

		
		//employeeRepository.save(employee);
		
		//System.out.println("Record inerted..");
	}

}
