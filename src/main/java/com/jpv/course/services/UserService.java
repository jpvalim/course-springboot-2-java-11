package com.jpv.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpv.course.entities.User;
import com.jpv.course.repositories.UserRepositoy;

@Service
public class UserService {
	
	@Autowired
	private UserRepositoy repository;
	
	public List<User> finAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
