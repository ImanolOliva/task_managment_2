package com.example.task_managment.controller;


import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.repository.entity.UserTask;
import com.example.task_managment.service.impl.UserTaskServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class UserTaskController {


    @Autowired
    private UserTaskServiceImpl userTaskService;





}
