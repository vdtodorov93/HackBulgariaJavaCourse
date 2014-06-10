package com.hackbulgaria.collectionsfun;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapUtilities {
    public static String hashToHumanReadable(HashMap<? extends Object, ? extends Object> map){
        StringBuilder builder = new StringBuilder();
        for(Object key: map.keySet()){
            builder.append(key.toString() + ":" + map.get(key).toString() + ", ");
        }
        builder.setLength(builder.length() - 2);
        return builder.toString();
    }
    
    public static LinkedHashMap<String, Integer> countOccurances(String sentence){
        LinkedHashMap<String, Integer> occurancesCounter = new LinkedHashMap<String, Integer>();
        String[] words = sentence.split(" ");
        for(String word: words){
            if(occurancesCounter.get(word) == null){
                occurancesCounter.put(word, 1);
            }
            else occurancesCounter.put(word, occurancesCounter.get(word) + 1);
        }
        
        return occurancesCounter;
    }
}
