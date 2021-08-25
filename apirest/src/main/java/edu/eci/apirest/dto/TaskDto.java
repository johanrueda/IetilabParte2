package edu.eci.apirest.dto;


import java.util.Date;

public class TaskDto {
    String name;
    String description;
    String status;
    String assignedTo;
    Date dueDate;
    Date createdAt;

    public TaskDto(String name, String description, String status, String assignedTo, Date dueDate, Date createdAt) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
    }
}
