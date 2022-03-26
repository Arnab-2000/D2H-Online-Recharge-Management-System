package com.examly.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
	
	
}
