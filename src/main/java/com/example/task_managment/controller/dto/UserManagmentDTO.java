package com.example.task_managment.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserManagmentDTO {

    private Long id;

    private String name;

    private String email;

    private Number phone;

    private String country;
}
