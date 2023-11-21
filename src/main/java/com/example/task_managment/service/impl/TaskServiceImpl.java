package com.example.task_managment.service.impl;

import com.example.task_managment.controller.dto.TaskDTO;
import com.example.task_managment.controller.dto.UserTaskDTO;
import com.example.task_managment.exception.NotFoundUserTaskException;
import com.example.task_managment.repository.TaskRepository;
import com.example.task_managment.repository.entity.Task;
import com.example.task_managment.repository.entity.UserTask;
import com.example.task_managment.repository.enums.StatusTask;
import com.example.task_managment.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskDTO taskAssign(TaskDTO taskDTO) {
        if(taskDTO.getDescription().isEmpty()){
                throw new NotFoundUserTaskException("Task not assigned");
        }

        Set<UserTask> userTaskDTOList = taskDTO.getUser_assignation();

        List <UserTask> userTasks = new ArrayList<>();

        for(UserTask userTaskDTO: userTaskDTOList){
            UserTask userTask = new UserTask();
            userTask.setName(userTaskDTO.getName());
            userTask.setEmail(userTaskDTO.getEmail());
            userTask.setPhone(userTaskDTO.getPhone());
            userTask.setDni(userTaskDTO.getDni());
            userTask.setAddress(userTaskDTO.getAddress());

           //Crear metodo para crear usuarios
            //userTasks.add(userTaskService.createUser(userTask));
        }

    }
  
    @Override
    public Task getTaskById(Long id) {
        return this.taskRepository.findById(id).orElseThrow(
                ()-> new NotFoundUserTaskException("Task does not exist")
        );
    }

    @Override
    public void deleteTask(Long id) {
        this.taskRepository.deleteById(id);
    }

    @Override
    public Task updateTask(TaskDTO taskDTO)  {

        if(taskDTO == null){
            return null;
        }
       Task task = new Task();

       task.setDescription(taskDTO.getDescription());
       this.taskRepository.save(task);
       return task;
    }
}
