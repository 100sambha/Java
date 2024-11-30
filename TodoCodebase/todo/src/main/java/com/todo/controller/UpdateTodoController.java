package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.pojo.Todo;
import com.todo.pojo.Todo.TodoBuilder;
import com.todo.service.UpdateTodoService;

@RestController
@RequestMapping("/todox")
public class UpdateTodoController {
	
	@Autowired
	UpdateTodoService updateTodoService;
	
	@PutMapping("/update")
	public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo) {
		
//		Todo td = new Todo.TodoBuilder().setNote(todo.getNote()).setTime(todo.getTime()).setTitle(todo.getTitle()).build();
//		System.out.println(td);
		
		TodoBuilder tBuilder = new TodoBuilder();
		if(todo.getTitle()!=null)tBuilder.setTitle(todo.getTitle());
		if(todo.getTime()!=null)tBuilder.setTime(todo.getTime());
		
		Todo td = tBuilder.build();
		
		Todo resTodo = updateTodoService.update(td); 
		return ResponseEntity.status(HttpStatus.OK).body(resTodo);
	}

}
