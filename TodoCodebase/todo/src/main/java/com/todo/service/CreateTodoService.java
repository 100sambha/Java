package com.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.pojo.Todo;
import com.todo.repository.CreateTodoRepository;

@Service
public class CreateTodoService {
	
	@Autowired
	CreateTodoRepository createTodoRepository;
	
	public Todo create(Todo todo) {
		return createTodoRepository.save(todo);
	}
}
