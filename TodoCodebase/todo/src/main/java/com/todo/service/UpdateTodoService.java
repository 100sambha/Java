package com.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.pojo.Todo;
import com.todo.repository.UpdateTodoRepository;

@Service
public class UpdateTodoService {
	
	@Autowired
	UpdateTodoRepository updateTodoRepository;
	
	public Todo update(Todo todo) {
		return updateTodoRepository.save(todo);
	}
}
