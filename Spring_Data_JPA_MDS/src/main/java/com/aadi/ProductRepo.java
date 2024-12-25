package com.aadi;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aadi.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
