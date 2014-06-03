package com.hackbulgaria.corejava.tddintro;

public class StringShimMethods {
    public static String stichMeUp(String glue, Object... args){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < args.length - 1; i++){
            builder.append(args[i].toString());
            builder.append(glue);
        }
        builder.append(args[args.length - 1]);
            
        return builder.toString();
    }
    
    
    
    
    
    
}
