package com.aadi.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	//Mysql -> Identify
	//Oracle -> Sequence
	//dont know which DB i am using->Auto
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer empId;
	 
	 private String empName;
	 
	 private Double empSalary;
	 
	 private String empGender;
	 
	 private String dept;
	 
	 @CreationTimestamp
	 @Column(name = "date_created",updatable = false)
	 private LocalDate dateCreated;
	 
	 @UpdateTimestamp
	 @Column(name = "last_updated",insertable = false)
	 private LocalDate lastUpdated;
}
