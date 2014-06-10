package com.hackbulgaria.collectionsfun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainFunc {
    public static void main(String[] args){
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("AZ", 2);
//        map.put("TI", 4);
//        map.put("AasdsaZ", 222);
//        map.put("TIRT", 111);
//        System.out.println(MapUtilities.hashToHumanReadable(map));
        String ninjas = "Ninjas are all over the place! We are all going to die!";
        System.out.println(MapUtilities.hashToHumanReadable(MapUtilities.countOccurances(ninjas)));
    }

}
