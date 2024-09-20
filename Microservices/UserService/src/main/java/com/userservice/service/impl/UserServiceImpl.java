package com.userservice.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.Repositories.UserRepositories;
import com.userservice.entities.User;
import com.userservice.expetions.ResourceNotFoundException;
import com.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepositories userRepositories;
	
	@Override
	public User createUser(User user) {
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		return userRepositories.save(user);
	}

	
	@Override
	public List<User> getAllUser() {
		return userRepositories.findAll();
	}

	@Override
	public User getUser(String userId) {
		return userRepositories.findById(userId).orElseThrow(()->new ResourceNotFoundException("With Given Id User Not Found "+userId));
	}

	@Override
	public void deleteUser(String userId) {
		userRepositories.deleteById(userId);
	}

	@Override
	public User updateUser(User user) {
		return userRepositories.save(user);
	}
}