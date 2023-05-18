package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class MinimumAddToMakeParenthesisValid {

    public static void main(String[] args) {


        String s = "(";

        Stack < Character > st = new Stack <>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
            } else if (!st.isEmpty()  && st.peek() == '(') {
                st.pop();
                count++;
            }else{
                st.push(c);
            }
        }

        System.out.println(st.size());
    }
}