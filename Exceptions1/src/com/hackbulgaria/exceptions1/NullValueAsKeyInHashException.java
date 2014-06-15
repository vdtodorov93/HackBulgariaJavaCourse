package com.hackbulgaria.exceptions1;

public class NullValueAsKeyInHashException extends RuntimeException {
    public NullValueAsKeyInHashException(){
        super("A NotRetardedHashMap cannot have a null key");
    }

}
