package com.detrox.TodoApp.services;

import com.detrox.TodoApp.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    void addTask(String title);

    void deleteTask(Long id);

    void toggleTask(Long id);
}
