package com.example.task_managment.repository.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    @NotNull
    @Email
    private String email;
    @NotNull
    private Integer phone;
    @Max(8)
    @Min(7)
    private Integer dni;

    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="task_id",nullable = false)
    private Task task;





}
