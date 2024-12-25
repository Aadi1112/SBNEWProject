package com.aadi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aadi.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
