package edu.eci.apirest.controller;


import edu.eci.apirest.data.Task;
import edu.eci.apirest.dto.TaskDto;
import edu.eci.apirest.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(@Autowired TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskDto task) {
        Task newTask = taskService.create(task);
        return new ResponseEntity<>(newTask, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable String id) {
        Task task = taskService.findById(id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Task>> allTasks() {
        List<Task> tasks = taskService.all();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        boolean result = taskService.deleteById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@RequestBody TaskDto task, @PathVariable String id) {
        Task newTask = taskService.update(task, id);
        return new ResponseEntity<>(newTask, HttpStatus.OK);
    }
}
