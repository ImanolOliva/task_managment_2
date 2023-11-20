package com.example.task_managment.controller;


import com.example.task_managment.controller.dto.TaskDTO;
import com.example.task_managment.repository.entity.Task;
import com.example.task_managment.service.impl.TaskServiceImpl;
import jakarta.persistence.Access;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@NoArgsConstructor
public class TaskController {


    @Autowired
    private TaskServiceImpl taskService;
    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TaskDTO createTask(@RequestBody TaskDTO taskDTO) throws Exception{

       return this.taskService.taskAssign(taskDTO);
    }

    @GetMapping(value = "/task/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Task getTaskById(@PathVariable Long id) throws Exception{
        return  this.taskService.getTaskById(id);
    }




}
