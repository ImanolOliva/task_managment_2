package com.example.task_managment.service;

import com.example.task_managment.controller.dto.UserManagmentDTO;
import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.repository.entity.Task;
import com.example.task_managment.repository.entity.UserManagment;
import com.example.task_managment.repository.entity.UserTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserManagmentService {

    UserTask createUser(UserTaskDTO userTaskDTO);



}
