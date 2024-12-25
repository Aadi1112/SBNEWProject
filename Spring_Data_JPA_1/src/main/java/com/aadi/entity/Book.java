package com.aadi.entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@javax.persistence.Entity(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	
	@Id
	private Integer id;
	
	private String bookName;
	
	private double bookPrice;
}
