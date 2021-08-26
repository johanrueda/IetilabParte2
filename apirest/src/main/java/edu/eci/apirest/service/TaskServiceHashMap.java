package edu.eci.apirest.service;

import edu.eci.apirest.data.Task;
import edu.eci.apirest.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService{
    private HashMap<String,Task> tasks = new HashMap<>();

    @Override
    public Task create(TaskDto task) {
        Task newTask = new Task(task,String.valueOf(tasks.size()+1));
        tasks.put(newTask.getId(),newTask);
        return newTask;
    }

    @Override
    public Task findById(String id) {
        return tasks.get(id);
    }

    @Override
    public List<Task> all() {
        return new ArrayList<>(tasks.values());
    }

    @Override
    public boolean deleteById(String id) {
        return tasks.remove(id) != null;
    }

    @Override
    public Task update(TaskDto task, String id) {
        Task newTask = new Task(task,id);
        tasks.put(newTask.getId(),newTask);
        return newTask;
    }
}
