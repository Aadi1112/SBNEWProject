package com.aadi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Size(min = 3,max = 15,message = "Name should be atleast 3 characterts and max 15 characters")
	@NotBlank(message = "Name is Mandatory")
	private String pName;
	
	@Positive(message = "Price Should be Postive value")
	@NotNull(message = "Price is Mandatory")
	private Double pPrice;
	
	@Positive(message = "Quantity Should be Postive value")
	@NotNull(message = "Quantity is Mandatory")
	private Integer qty;
}
