package com.example.task_managment.controller.dto;

import com.example.task_managment.repository.entity.UserTask;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class TaskDTO {

    private Long id;

    private String description;

    private String state;

    private Set<UserTask> user_assignation;

    private Date date;

}
