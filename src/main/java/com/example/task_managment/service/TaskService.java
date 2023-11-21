package com.example.task_managment.service;

import com.example.task_managment.controller.dto.TaskDTO;
import com.example.task_managment.repository.entity.Task;
import com.example.task_managment.repository.entity.UserTask;

public interface TaskService {

    TaskDTO taskAssign(TaskDTO taskDTO);

    Task getTaskById(Long id);


    void deleteTask(Long id);

    Task updateTask(TaskDTO taskDTO);



}
