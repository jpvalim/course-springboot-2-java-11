package com.jpv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpv.course.entities.OrderItem;

public interface OrderItemRepositoy extends JpaRepository<OrderItem, Long> {

	
}
