package com.hackbulgaria.exceptions1;

public class AddInImmutableCollectionException extends RuntimeException {
    public AddInImmutableCollectionException(){
        super("You can't modify elements in immutable object");
    }

}
