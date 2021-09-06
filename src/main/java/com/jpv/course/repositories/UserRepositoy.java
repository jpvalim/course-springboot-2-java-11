package com.jpv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpv.course.entities.User;

public interface UserRepositoy extends JpaRepository<User, Long> {

	
}
