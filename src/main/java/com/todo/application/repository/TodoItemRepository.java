package com.todo.application.repository;

import com.todo.application.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository <TodoItem, Long> {
}
