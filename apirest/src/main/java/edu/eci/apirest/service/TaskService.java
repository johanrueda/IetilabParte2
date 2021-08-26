package edu.eci.apirest.service;

import edu.eci.apirest.data.Task;
import edu.eci.apirest.dto.TaskDto;

import java.util.List;

public interface TaskService {

        Task create(TaskDto task );

        Task findById( String id );

        List<Task> all();

        boolean deleteById(String id );

        Task update( TaskDto task, String id );

}
