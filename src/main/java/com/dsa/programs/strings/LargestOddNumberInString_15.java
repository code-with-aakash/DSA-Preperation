package com.dsa.programs.strings;

public class LargestOddNumberInString_15 {

    public static void main(String[] args) {

        String num = "52";

        //brute force approach
        Long res = 0L;
        Long max =0L;
        for (int i = 0; i < num.length(); i++) {

            if(Character.isDigit(num.charAt(i))){

                res =res *10+ num.charAt(i)-'0';

                if(res%2!=0){
                    max = res;
                }

            }

        }

        System.out.println(max);


        for (int i = num.length()-1; i >=0; i--) {
            // here we are checking from the last character if it is divisible by 2 or not
            // if it is divisible by 2 means its even number if its not ans
            // remainder is 1 means its  even number
            // here we are only checking the last charaacter if its even or odd.
            if(num.charAt(i) % 2 == 1 ) {
                System.out.println(num.substring(0, i+1));
            }
        }
    }
}
