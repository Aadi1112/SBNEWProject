package com.aadi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aadi.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
