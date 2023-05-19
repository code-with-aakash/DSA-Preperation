package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class BasicCalculator2 {

    public static void main(String[] args) {

        String s =" 3/2";

        Stack<Integer> sk = new Stack <>();
        char sign='+';

        for (int i = 0; i <s.length() ; i++) {

            if(Character.isDigit(s.charAt(i))){
                int val =0;

                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;

                if(sign=='+'){
                    sk.push(val);
                } else if (sign=='-') {
                    sk.push(-val);
                }else if(sign=='*'){
                    int num = sk.pop();
                    int ans = val*num;
                    sk.push(ans);
                }else if(sign=='/'){
                    int num = sk.pop();
                    int ans = num/val;
                    sk.push(ans);
                }


            } else if (s.charAt(i)!=' ') {
                sign=s.charAt(i);

            }

        }

        int sum =0 ;
        while(!sk.isEmpty()){

            sum+=sk.pop();
        }

        System.out.println("Sum is "+sum);

    }

}
