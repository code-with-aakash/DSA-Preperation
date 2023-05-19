package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

//        '(', ')', '{', '}', '[' and ']',

        String s="(])";

        char[] c = s.toCharArray();
        Stack<Character> st = new Stack <>();

        for (char value : c) {
            {

                if (isOpening(value)) {
                    st.push(value);
                } else if (st.isEmpty()) {
                    System.out.println("invalid");
                } else if (!st.empty() && st.peek() == isClosing(value)) {
                    System.out.println("valid");
                    System.out.println(st.pop());
                } else {
                    System.out.println("invalid");
                }
            }

        }
    }
    static boolean isOpening(char c){
        return c == '(' || c == '{' || c == '[';


    }

    static char isClosing(char c){

        if (c==')' ){

            return '(';

        }
            else if( c=='}' ){
                return '{';
        }
                else if ( c==']') {
            return '[';
        }
        return '0';
    }



}
