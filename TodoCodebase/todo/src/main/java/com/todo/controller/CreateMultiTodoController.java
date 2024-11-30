package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.pojo.Todo;
import com.todo.service.CreateMultiTodoService;

@RestController
@RequestMapping("/todos")
public class CreateMultiTodoController {
	
	@Autowired
	CreateMultiTodoService createMultiTodoService;
	
	@PostMapping("/createm")
	public ResponseEntity<List<Todo>> create(@RequestBody List<Todo> todos) {
		System.out.println(todos);
		
		List<Todo> todosList = createMultiTodoService.create(todos);
//		return new ResponseEntity<>(todosList,HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(todosList);
	}
}