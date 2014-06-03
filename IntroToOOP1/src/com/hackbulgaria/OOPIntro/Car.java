package com.hackbulgaria.OOPIntro;

public class Car implements ICar{
    private String engine;
    
    @Override
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    @Override
    public String toString(){
        return "Car";
    }
    
    public static class Audi extends Car{
        
        @Override
        public String getEngine(){
            
            return "Audi engine";
        }
        
        @Override
        public String toString() {
            return "Audi " + super.toString();
        }
    }

}
