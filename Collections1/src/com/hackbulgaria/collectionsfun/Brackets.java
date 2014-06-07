package com.hackbulgaria.collectionsfun;

import java.util.Stack;

public class Brackets {
    public static boolean checkExpression(String expr){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < expr.length(); i++){
            char c = expr.charAt(i);
            if(c == '('){
                st.push(c);
            }
            else if(st.isEmpty()){
                return false;
            }
            else {
                st.pop();
            }
        }
        
        return st.isEmpty();
    }
}
