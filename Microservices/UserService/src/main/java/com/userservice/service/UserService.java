package com.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.userservice.entities.User;

@Service
public interface UserService {
	
	User createUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);
	
	void deleteUser(String userId);
	
	User updateUser(User userId);
}