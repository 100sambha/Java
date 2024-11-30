package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.pojo.Todo;
import com.todo.service.CreateTodoService;

@RestController
@RequestMapping("/todo")
public class CreateTodoController {
	
	@Autowired
	CreateTodoService createTodoService;
	
	@PostMapping("/create")
	public ResponseEntity<Todo> createToto(@RequestBody Todo todo ) {
		Todo resTodo = createTodoService.create(todo);		
		return new ResponseEntity<>(resTodo, HttpStatus.OK);
	}
}