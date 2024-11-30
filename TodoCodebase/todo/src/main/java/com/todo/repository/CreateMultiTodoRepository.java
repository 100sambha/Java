package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.pojo.Todo;

@Repository
public interface CreateMultiTodoRepository extends JpaRepository<Todo, Integer> {

}
