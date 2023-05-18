package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

//        '(', ')', '{', '}', '[' and ']',

        String s="(])";

        char[] c = s.toCharArray();
        Stack<Character> st = new Stack <>();

        for (int i = 0; i < c.length; i++) {{

            if (isOpening(c[i])){
                st.push(c[i]);
            } else if (st.isEmpty()) {
                System.out.println("invalid");
            } else if(!st.empty()&& st.peek()==isClosing(c[i])){
                System.out.println("valid");
                System.out.println(st.pop());;
            }else{
                System.out.println("invalid");
            }
        }

        }
    }
    static boolean isOpening(char c){
    if (c=='(' || c=='{' || c=='['){
        return true;
    }
    return false;


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
