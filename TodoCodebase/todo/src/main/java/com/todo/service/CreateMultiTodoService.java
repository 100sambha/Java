package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.pojo.Todo;
import com.todo.repository.CreateMultiTodoRepository;

@Service
public class CreateMultiTodoService {
	
	@Autowired
	CreateMultiTodoRepository createMultiTodoRepository;
	
	public List<Todo> create(List<Todo> todos) {
		return createMultiTodoRepository.saveAll(todos); 
	}
}
