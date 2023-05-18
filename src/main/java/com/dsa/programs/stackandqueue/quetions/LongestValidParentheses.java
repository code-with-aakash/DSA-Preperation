package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {


        String s="()(()";

        
        Stack <Character> st = new Stack <>();

        int count=0;
        for (char c : s.toCharArray()) {
            if (c=='(' ){
                st.push(c);
            } else if(!st.isEmpty() && st.size()==1 &&  c == ')' && st.peek() == '(' && count==0)
            {
                System.out.println("valid");
                System.out.println(st.pop());;
                count=count+2;
            }
        }

        System.out.println("count is "+count);
    }


    static char isClosing(char c){

        if (c==')' ){
            return '(';
        }
        return '0';
    }


}
