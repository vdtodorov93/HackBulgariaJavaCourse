package com.hackbulgaria.corejava;

public class FaultyProblem3 {
    
    public String reverseEveryWordInString(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word: words){
            //sentence = sentence.replace(word, reverse(word));
            String revWord = (String)reverse(word);
            result.append(revWord);
            result.append(' ');
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }

    private CharSequence reverse(String word) {
        return Utils.reverseMe(word);
    }
}
