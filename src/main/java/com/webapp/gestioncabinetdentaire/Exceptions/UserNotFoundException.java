package com.webapp.gestioncabinetdentaire.Exceptions;

public class UserNotFoundException extends RuntimeException{
    private UserNotFoundException(String message){
        super(message);
    }
}
