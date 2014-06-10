package com.hackbulgaria.collectionsfun;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
    
    public static String applyCipher(Map<Character, Character> cipher, String bullshit){
        for(Character c: cipher.keySet()){
            bullshit = bullshit.replace(c, cipher.get(c));
        }
        return bullshit;
    }
    
    public static String decrypt(String bullshit){
        bullshit = bullshit.toLowerCase();
        HashMap<Character, Integer> histo = new HashMap<>();
        
        for(int i = 0; i < bullshit.length(); i++){
            
            Character c = bullshit.charAt(i);
            if (c == ' ') continue;
            if(histo.get(c) == null){
                histo.put(c, 1);
            }
            else histo.put(c, histo.get(c) + 1);
        }
        System.out.println(hashToHumanReadable(histo));
        return "M";
    }
}
