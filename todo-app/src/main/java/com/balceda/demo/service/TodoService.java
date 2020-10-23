package com.balceda.demo.service;

import com.balceda.demo.entity.Todo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class TodoService {

    @PersistenceContext
    EntityManager entityManager;

    public Todo createTodo(Todo todo) {
        entityManager.persist(todo);
        return todo;
    }

    public Todo updateTodo(Todo todo) {
        entityManager.merge(todo);
        return todo;
    }

    public Todo findById(Long id) {
        return entityManager.find(Todo.class, id);
    }

    public List<Todo> getAll() {
        return entityManager.createQuery("select t from Todo t", Todo.class)
                .getResultList();
    }
}
