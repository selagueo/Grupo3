package com.app.lightwork.errors;

public class ServiceError extends Exception{
    /*
        This class is for throwing only SYSTEM RELATED ERRORS.
    */
    public ServiceError(String msn){
        super(msn);
    }
}