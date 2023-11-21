package com.example.task_managment.exception;

public class NotFoundIdError extends NotFoundCustomError{

    public NotFoundIdError(String msj) {
        super("ID NOT FOUND");
    }
}
