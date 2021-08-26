package edu.eci.apirest.data;

import edu.eci.apirest.dto.TaskDto;
import edu.eci.apirest.enums.Status;

import java.util.Date;

public class Task {
    String id;
    String name;
    Status status;
    String assignedTo;
    Date dueDate;
    Date created;

    public Task(String id, String name, Status status, String assignedTo, Date dueDate, Date created) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    public Task(TaskDto task, String id){
        this.id=id;
        this.name=task.getName();
        this.status=task.getStatus();
        this.assignedTo=task.getAssignedTo();
        this.dueDate=task.getDueDate();
        this.created=task.getCreatedAt();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
