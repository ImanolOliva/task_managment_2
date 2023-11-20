package com.example.task_managment.controller.dto;


import com.example.task_managment.repository.entity.UserTask;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserTaskDTO {

    private Long id;

    private String name;
    private String email;
    private Number phone;

    private Integer dni;

    private String address;

    private String rol;

}
