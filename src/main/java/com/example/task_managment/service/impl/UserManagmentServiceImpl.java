package com.example.task_managment.service.impl;

import com.example.task_managment.controller.dto.UserManagmentDTO;
import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.repository.UserTaskRepository;
import com.example.task_managment.repository.entity.UserManagment;
import com.example.task_managment.repository.entity.UserTask;
import com.example.task_managment.service.UserManagmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserManagmentServiceImpl implements UserManagmentService {


     @Autowired
     private UserTaskRepository userTaskRepository;

        @Override
        public UserTask createUser(UserTaskDTO userTaskDTO){

            UserTask userTask = new UserTask();
            userTask.setAddress(userTaskDTO.getAddress());
            userTask.setName(userTaskDTO.getName());
            userTask.setDni(userTaskDTO.getDni());
            userTask.setPhone(userTask.getPhone());
            userTask.setEmail(userTask.getEmail());
            userTask.setTask(userTask.getTask());

            if((userTask.getName() == null &&  userTask.getAddress() == null) || (userTask.getAddress() == null && userTask.getDni() == null )){
                return null;
            }
            return this.userTaskRepository.save(userTask);
        }
}

