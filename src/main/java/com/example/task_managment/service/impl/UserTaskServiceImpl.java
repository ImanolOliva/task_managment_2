package com.example.task_managment.service.impl;

import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.exception.NotFoundUserTaskException;
import com.example.task_managment.repository.UserTaskRepository;
import com.example.task_managment.repository.entity.UserTask;
import com.example.task_managment.service.UserTaskService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserTaskServiceImpl implements UserTaskService {



    @Autowired
    UserTaskRepository userTaskRepository;



    @Override
    public UserTask getUserById(Long id) {
        return this.userTaskRepository.findById(id).orElseThrow(
                ()-> new NotFoundUserTaskException("this user not found"));
    }

    @Override
    public List<UserTask> getAllUser(UserTaskDTO userTaskDTO) {
        List<UserTask> userTasksList = userTaskRepository.findAll();
        if(userTasksList.isEmpty()){
            return null;
        }
        return userTasksList;
    }

}

