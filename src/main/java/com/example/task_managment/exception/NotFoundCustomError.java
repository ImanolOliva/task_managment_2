package com.example.task_managment.exception;

public abstract class NotFoundCustomError extends RuntimeException {

   String message = "";

   NotFoundCustomError(String msj){
       this.message = msj;
   }
}
