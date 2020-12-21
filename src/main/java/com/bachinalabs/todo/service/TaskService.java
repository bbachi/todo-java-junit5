package com.bachinalabs.todo.service;

import com.bachinalabs.todo.dto.TaskDTO;
import com.bachinalabs.todo.entity.Task;
import com.bachinalabs.todo.repository.TasksRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TaskService {

    @Autowired
    private TasksRepository tasksRepository;

    public TaskService() { }

    public List<Task> getTasks() {
        return tasksRepository.findAll();
    }

    public Task getTask(long taskId) {
        Optional<Task> task = tasksRepository.findById(taskId);
        return task.get();
    }

    public Task saveTask(TaskDTO taskDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Task task = modelMapper.map(taskDTO, Task.class);
        return tasksRepository.save(task);
    }

    public Task updateTask(TaskDTO taskDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Task task = modelMapper.map(taskDTO, Task.class);
        return tasksRepository.save(task);
    }

    public int deleteTask(int taskId) {
        tasksRepository.deleteById(Integer.valueOf(taskId));
        return taskId;
    }
}
