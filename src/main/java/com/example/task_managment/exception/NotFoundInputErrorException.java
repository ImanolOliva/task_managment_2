package com.example.task_managment.exception;

public abstract class NotFoundInputErrorException extends RuntimeException{

    private String msj;

    public NotFoundInputErrorException(String message){
        this.msj = message;
    }
}
