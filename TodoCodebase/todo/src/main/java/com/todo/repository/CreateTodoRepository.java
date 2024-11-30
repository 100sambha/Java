package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.pojo.Todo;

public interface CreateTodoRepository extends JpaRepository<Todo, Integer>{
	
}
