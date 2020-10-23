package com.balceda.demo.entity;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Todo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Task must be set")
    @Size(min = 10, message = "Task should not be less than 10 characters")
    @Column(name = "TASK")
    private String task;

    @Column(name = "IS_COMPLETED")
    private boolean isCompleted;

    @NotNull(message = "Due date must be set")
    @FutureOrPresent(message = "Due date must be in the present or future")
    @JsonbDateFormat("dd-MM-yyyy")
    @Column(name = "DUE_DATE")
    private LocalDate dueDate;

    @Column(name = "DATE_COMPLETED")
    @JsonbDateFormat("dd-MM-yyyy")
    private LocalDate dateCompleted;

    @Column(name = "DATE_CREATED")
    @JsonbDateFormat("dd-MM-yyyy")
    private LocalDate dateCreated;

    @PrePersist
    protected void init() {
        setDateCreated(LocalDate.now());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
