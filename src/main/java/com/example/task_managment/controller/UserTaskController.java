package com.example.task_managment.controller;


import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.repository.entity.UserTask;
import com.example.task_managment.service.impl.UserTaskServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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




    @PostMapping(value = "/user")
    public ResponseEntity<?> createUser(@RequestBody UserTaskDTO  userTaskDTO) throws  Exception{
       UserTask userTask= this.userTaskService.createUser(userTaskDTO);

       if(userTask == null){
           return ResponseEntity.badRequest().build();
       }
       return ResponseEntity.accepted().build();
    }


    @GetMapping(value = "/user")
    @ResponseStatus(HttpStatus.OK)
    public List<UserTask> getAllUsersTaks(UserTaskDTO userTaskDTO) throws Exception{
       return this.userTaskService.listUser(userTaskDTO);
    }


    @GetMapping(value = "/user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserTask getUserById(@PathVariable Long id) throws Exception{
        return  this.userTaskService.getUserById(id);
    }





}
