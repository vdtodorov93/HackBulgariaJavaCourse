package com.hackbulgaria.exam1;

public class InvalidLoggerLevelException extends RuntimeException {
    public InvalidLoggerLevelException(){
        super("Log level must be > 0");
    }
}
