package com.example.task_managment.service;

import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.repository.entity.UserTask;

import java.util.List;

public interface UserTaskService {

    UserTask createUser(UserTaskDTO userTaskDTO);


    List<UserTask> listUser(UserTaskDTO userTaskDTO);

    UserTask getUserById(Long id);


}
