package com.jpv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpv.course.entities.Order;

public interface OrderRepositoy extends JpaRepository<Order, Long> {

	
}
