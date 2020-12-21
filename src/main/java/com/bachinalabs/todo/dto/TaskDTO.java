package com.bachinalabs.todo.dto;

import lombok.Data;

@Data
public class TaskDTO {

    private long id;
    private String name;
    private String email;
    private String description;
    private String createdDate;
}
