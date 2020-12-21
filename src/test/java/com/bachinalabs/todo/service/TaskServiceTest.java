package com.bachinalabs.todo.service;

import com.bachinalabs.todo.dto.TaskDTO;
import com.bachinalabs.todo.entity.Task;
import com.bachinalabs.todo.repository.TasksRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@DisplayName("Task Service Test")
@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @Mock
    TasksRepository tasksRepositoryMock;

    @InjectMocks
    TaskService taskService;

    @Test
    @DisplayName("Should return empty list of tasks when there are no tasks")
    void shouldGetEmptyTasksWhenCalled() {

        when(tasksRepositoryMock.findAll()).thenReturn(new ArrayList<>());

        List<Task> tasks = taskService.getTasks();

        assertThat(tasks.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("Should return list of tasks when there are tasks")
    void shouldGetTasksWhenCalled() {

        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task(1, "name1", "description1", "abc@gmail.com"));
        taskList.add(new Task(2, "name2", "description2", "abc@admin.com"));
        when(tasksRepositoryMock.findAll()).thenReturn(taskList);

        List<Task> tasks = taskService.getTasks();

        assertThat(tasks.size()).isEqualTo(2);
    }

}
