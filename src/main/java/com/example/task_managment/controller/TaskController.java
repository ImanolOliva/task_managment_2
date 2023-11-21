package com.example.task_managment.controller;


import com.example.task_managment.controller.dto.TaskDTO;
import com.example.task_managment.exception.NotFoundIdError;
import com.example.task_managment.exception.NotFoundTaskUpdateError;
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
    @PostMapping("/task")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TaskDTO createTask(@RequestBody TaskDTO taskDTO) throws Exception{

       return this.taskService.taskAssign(taskDTO);
    }

    @GetMapping(value = "/task/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Task getTaskById(@PathVariable Long id) throws Exception{
        return  this.taskService.getTaskById(id);
    }


    @DeleteMapping(value = "/task/{id}")
    public ResponseEntity<Task> deleteTask(@PathVariable Long id) throws NotFoundIdError {
            this.taskService.deleteTask(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }


    @PutMapping(value = "/task")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Task updateTask(@RequestBody TaskDTO taskDTO) throws NotFoundTaskUpdateError {
        return this.taskService.updateTask(taskDTO);
    }




}
