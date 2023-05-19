package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class BasicCalculator1 {

    public static void main(String[] args) {


        String s = "1-(     -2)";
        Stack < Integer > sk = new Stack <>();
        int sign = 1;
        int sum =0;

        int i = 0;
        while (i < s.length()) {
            int val = 0;
            if (Character.isDigit(s.charAt(i))) {
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    val = val * 10 + ( s.charAt(i) - '0' );
                    i++;
                }
                i--;
                val =val*sign;
                sign =1;
                sum +=val;

            }else if (s.charAt(i) == '(') {
                    sk.push(sum);
                    sk.push(sign);
                    sum=0;
                    sign = 1;
                } else if (s.charAt(i)==')') {
                    sum *= sk.pop();
                    sum += sk.pop();
                } else if (s.charAt(i)=='-') {
                    sign *=-1;
                }
            i++;
        }

        System.out.println(sum);
    }
}