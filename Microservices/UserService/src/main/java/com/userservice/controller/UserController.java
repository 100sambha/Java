package com.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.entities.User;
import com.userservice.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user){
		System.out.println("----------------------->create");
		User userDataResp = userService.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userDataResp);
	}
	
	@GetMapping("/getuser/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId) {
		System.out.println("----------------------->getUser");
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/allusers")
	public ResponseEntity<List<User>> getAllUsers() {
		System.out.println("----------------------->getAllUser");
		List<User> listUsers = userService.getAllUser();
		return ResponseEntity.ok(listUsers);
	}
	
//	pub
}