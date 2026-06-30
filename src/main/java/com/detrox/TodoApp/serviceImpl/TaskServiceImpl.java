package com.detrox.TodoApp.serviceImpl;

import com.detrox.TodoApp.model.Task;
import com.detrox.TodoApp.repository.TaskRepository;
import com.detrox.TodoApp.services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    @Autowired
    private final TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
