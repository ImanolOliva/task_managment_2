package com.example.task_managment.controller;


import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.repository.entity.UserTask;
import com.example.task_managment.service.UserManagmentService;
import com.example.task_managment.service.impl.UserManagmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagmentController {


    @Autowired
    private UserManagmentServiceImpl userManagmentService;

    @PostMapping(value = "/user")
    public ResponseEntity<?> createUser(@RequestBody UserTaskDTO userTaskDTO) throws  Exception{
        UserTask userTask= this.userManagmentService.createUser(userTaskDTO);
        if(userTask == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.accepted().build();
    }

}
