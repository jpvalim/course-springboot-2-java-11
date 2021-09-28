package com.jpv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpv.course.entities.Category;

public interface CategoryRepositoy extends JpaRepository<Category, Long> {

	
}
