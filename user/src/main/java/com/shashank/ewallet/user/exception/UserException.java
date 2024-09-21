package com.shashank.ewallet.user.exception;




public class UserException extends RuntimeException{

    private String type;
    private String message;

    public UserException(String type,String message){
        this.type=type;
        this.message=message;
    }

    public String getType(){
        return type;
    }

    public String getMessage(){
        return message;
    }
}
