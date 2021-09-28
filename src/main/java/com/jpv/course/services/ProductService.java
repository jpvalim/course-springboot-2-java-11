package com.jpv.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpv.course.entities.Product;
import com.jpv.course.repositories.ProductRepositoy;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepositoy repository;
	
	public List<Product> finAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
