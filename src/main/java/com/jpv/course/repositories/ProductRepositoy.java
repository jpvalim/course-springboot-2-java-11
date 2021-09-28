package com.jpv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpv.course.entities.Product;

public interface ProductRepositoy extends JpaRepository<Product, Long> {

	
}
