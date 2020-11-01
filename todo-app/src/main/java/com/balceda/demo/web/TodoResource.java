package com.balceda.demo.web;

import com.balceda.demo.entity.Todo;
import com.balceda.demo.service.TodoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("todos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    @Inject
    TodoService todoService;

    @POST
    public Response createTodo(Todo todo) {
        todoService.createTodo(todo);
        return Response.ok(todo).build();
    }

    @PUT
    public Response updateTodo(Todo todo) {
        todoService.updateTodo(todo);
        return Response.ok(todo).build();
    }

    @GET
    @Path("{id}")
    public Todo findById(@PathParam("id") Long id) {
        return todoService.findById(id);
    }

    @GET
    public List<Todo> getAll() {
        return todoService.getAll();
    }

    @POST
    @Path("complete")
    public Response markAsComplete(@QueryParam("id") Long id) {

        Todo todo = todoService.findById(id);
        todo.setIsCompleted(true);
        todoService.updateTodo(todo);
        return Response.ok(todo).build();
    }
}
