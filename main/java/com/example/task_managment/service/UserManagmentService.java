package com.example.task_managment.service;

import com.example.task_managment.controller.dto.UserManagmentDTO;
import com.example.task_managment.repository.entity.UserManagment;

public interface UserManagmentService {


    UserManagment createUserManagment(UserManagmentDTO userManagmentDTO);


}
