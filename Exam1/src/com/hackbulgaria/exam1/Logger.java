package com.hackbulgaria.exam1;

public class Logger {
    protected int level;

    protected static final int defaultLevel = 3;
    
    protected void checkValidLevel(int level){
        if(level <= 0){
            throw new InvalidLoggerLevelException();
        }
    }
    
    public Logger(int level){
        setLevel(level);
    }
    
    public Logger(){
        this(defaultLevel);
    }
    
    public void setLevel(int level){
        checkValidLevel(level);
        this.level = level;
    }
    
    public int getLevel(){
        return level;
    }
    public void log(int level, String message){
        checkValidLevel(level);
        if(level <= this.level){
            System.out.println(message);
        }
    }
    
    public void log(String message){
        log(defaultLevel, message);
    }
    
    

}
