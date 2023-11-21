package com.example.task_managment.repository.entity;

import com.example.task_managment.repository.enums.StatusTask;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Enumerated(value = EnumType.STRING)
    private StatusTask state;


    private Date date;


    @OneToMany(mappedBy = "task")
    private Set<UserTask> user_assignation;




}
