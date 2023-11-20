package com.example.task_managment.service;

import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.repository.entity.UserTask;
import org.apache.catalina.User;

import java.util.List;

public interface UserTaskService {

    UserTask getUserById(Long id);

    List<UserTask> getAllUser(UserTaskDTO userTaskDTO);

}
