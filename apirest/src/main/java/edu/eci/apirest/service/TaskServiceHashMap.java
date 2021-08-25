package edu.eci.apirest.service;

import edu.eci.apirest.data.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService{
    private HashMap<String,Task> tasks = new HashMap<>();

    @Override
    public Task create(Task task) {
        tasks.put(task.getId(),task);
        return task;
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
    public Task update(Task task, String id) {
        task.setId(id);
        tasks.replace(id,task);
        return task;
    }
}
