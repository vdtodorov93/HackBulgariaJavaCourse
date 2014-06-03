package com.hackbulgaria.oopfun;
import java.util.Calendar;
import java.util.Date;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private int day;
    private int month;
    private int year;
    
    public Time(int hour, int minute, int second, int day, int month, int year){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public static Time now(){
        Date today = new Date();
        Calendar instance = Calendar.getInstance();
        int hour = instance.get(Calendar.HOUR_OF_DAY);
        int minute = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);
        int day = instance.get(Calendar.DAY_OF_MONTH);
        int month = instance.get(Calendar.MONTH);
        int year = instance.get(Calendar.YEAR);
        
        return new Time(hour, minute, second, day, month, year);
    }
    
    @Override
    public String toString() {
        return String.format("%d:%d:%d %d:%d:%d", hour, minute, second, day, month, year);
    }

}
