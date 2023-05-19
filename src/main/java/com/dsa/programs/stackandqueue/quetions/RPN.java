package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class RPN {

    public static void main(String[] args) {

        String[] s ={ "2","1","+","3","*"};
        Stack<Integer> sl = new Stack<>();

        for (String value : s) {

            if (!value.equals("+") && !value.equals("-") && !value.equals("*") && !value.equals("/")) {

                sl.push(Integer.valueOf(value));
            } else {
                int a = sl.pop();
                int b = sl.pop();
                if (value.equalsIgnoreCase("+")) {
                    sl.push(a + b);
                } else if (value.equalsIgnoreCase("-")) {
                    sl.push(b - a);
                } else if (value.equalsIgnoreCase("*")) {
                    sl.push(b * a);
                } else {
                    sl.push(b / a);
                }

            }

        }


        System.out.println(sl.peek());

    }

}
