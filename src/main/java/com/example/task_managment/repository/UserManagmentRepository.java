package com.example.task_managment.repository;

import com.example.task_managment.repository.entity.UserManagment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserManagmentRepository  extends JpaRepository<UserManagment,Long> {

}
