package com.hackbulgaria.exceptions1;

public class ServiceNotAvailableAtTheMoment extends Exception {
    public ServiceNotAvailableAtTheMoment(String msg){
        super("The service you are trygin to use is currently not available. More information: " + msg);
    }    
}
