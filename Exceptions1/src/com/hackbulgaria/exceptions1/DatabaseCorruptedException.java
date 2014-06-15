package com.hackbulgaria.exceptions1;

public class DatabaseCorruptedException extends RuntimeException {
    public DatabaseCorruptedException(){
        super("Corrupted database object detected: \"\" is not a valid username for User");
    }

}
