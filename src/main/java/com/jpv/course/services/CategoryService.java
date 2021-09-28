package com.jpv.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpv.course.entities.Category;
import com.jpv.course.repositories.CategoryRepositoy;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepositoy repository;
	
	public List<Category> finAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
