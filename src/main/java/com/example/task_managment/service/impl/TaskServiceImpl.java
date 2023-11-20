package com.example.task_managment.service.impl;

import com.example.task_managment.controller.dto.TaskDTO;
import com.example.task_managment.exception.NotFoundUserTaskException;
import com.example.task_managment.repository.TaskRepository;
import com.example.task_managment.repository.entity.Task;
import com.example.task_managment.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskDTO taskAssign(TaskDTO taskDTO) {
        if(taskDTO.getDescription().isEmpty()){
                throw new NotFoundUserTaskException("Task not assigned");
        }
        Task task = new Task();
        task.setDescription(taskDTO.getDescription());
        task.setState(taskDTO.getState());
        this.taskRepository.save(task);
        return taskDTO;

    }
  
    @Override
    public Task getTaskById(Long id) {
        return this.taskRepository.findById(id).orElseThrow(
                ()-> new NotFoundUserTaskException("Task does not exist")
        );
    }



}
