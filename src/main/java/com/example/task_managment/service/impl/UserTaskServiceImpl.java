package com.example.task_managment.service.impl;

import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.exception.NotFoundUserTaskException;
import com.example.task_managment.repository.UserTaskRepository;
import com.example.task_managment.repository.entity.UserTask;
import com.example.task_managment.service.UserTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserTaskServiceImpl implements UserTaskService {


    @Autowired
    UserTaskRepository userTaskRepository;


    @Override
    public UserTask createUser(UserTaskDTO userTaskDTO){

            UserTask userTask = new UserTask();
            userTask.setAddress(userTaskDTO.getAddress());
            userTask.setName(userTaskDTO.getName());
            userTask.setDni(userTaskDTO.getDni());
            userTask.setPhone(userTask.getPhone());
            userTask.setEmail(userTask.getEmail());
            userTask.setRol(userTask.getRol());

      if((userTask.getName() == null &&  userTask.getAddress() == null) || (userTask.getAddress() == null && userTask.getDni() == null )){
           return null;
      }
       return this.userTaskRepository.save(userTask);
    }

    @Override
    public List<UserTask> listUser(UserTaskDTO userTaskDTO) {
        List<UserTask> userTasksList = userTaskRepository.findAll();
        if(userTasksList.isEmpty()){
            return null;
        }
        return userTasksList;
        }

    @Override
    public UserTask getUserById(Long id) {
        return this.userTaskRepository.findById(id).orElseThrow(
                ()-> new NotFoundUserTaskException("this user not found"));
    }



}

