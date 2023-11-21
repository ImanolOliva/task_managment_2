package com.example.task_managment.exception;

public class NotFoundTaskUpdateError extends NotFoundCustomError{

    NotFoundTaskUpdateError(String msj) {
        super("ERROR UPDATE TASK");
    }
}
