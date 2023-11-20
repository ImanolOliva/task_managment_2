package com.example.task_managment.exception;

public class NotFoundUserTaskException extends NotFoundCustomError{

    private String msj;


    public NotFoundUserTaskException(String message) {
        super(message);
    }
}
