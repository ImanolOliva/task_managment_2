package com.example.task_managment.exception;

public class NotFoundUserTaskException extends NotFoundInputErrorException{

    private String msj;


    public NotFoundUserTaskException(String message) {
        super(message);
    }
}
