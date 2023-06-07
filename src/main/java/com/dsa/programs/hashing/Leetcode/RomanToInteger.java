package com.dsa.programs.hashing.Leetcode;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {


        HashMap<Character,Integer> hmap = new HashMap<>();

        hmap.put('I',1);
        hmap.put('V',5);
        hmap.put('X',10);
        hmap.put('L',50);
        hmap.put('C',100);
        hmap.put('D',500);
        hmap.put('M',1000);

        String s ="MCMXCIV";

        // naive solution
        int res=0;
        for (int i = 0; i < s.length(); i++) {

            if(i<s.length()-1 && hmap.get(s.charAt(i))<hmap.get(s.charAt(i+1))){
                res-=hmap.get(s.charAt(i));
            }

//            if(i>0 && s.charAt(i)=='I' && (s.charAt(i+1)=='V' ||s.charAt(i+1)=='X')){
//
//                res-=hmap.get(s.charAt(i));
//
//            }
//            else if(i>0 && s.charAt(i)=='X' && (s.charAt(i+1)=='L' ||s.charAt(i+1)=='C')){
//
//                res-=hmap.get(s.charAt(i));
//
//            }
//            else if(i>0 && s.charAt(i)=='C' && (s.charAt(i+1)=='M' ||s.charAt(i+1)=='D')){
//
//                res-=hmap.get(s.charAt(i));
//
//            }

            else {
                res+= hmap.get(s.charAt(i));
            }


        }
        System.out.println(res);

        // efficient solution

//        int answer = 0, number = 0, prev = 0;
//        for (int j = s.length() - 1; j >= 0; j--) {
//            switch (s.charAt(j)) {
//                case 'M' -> number = 1000;
//                case 'D' -> number = 500;
//                case 'C' -> number = 100;
//                case 'L' -> number = 50;
//                case 'X' -> number = 10;
//                case 'V' -> number = 5;
//                case 'I' -> number = 1;
//            }
//            if (number < prev) {
//                answer -= number;
//            }
//            else {
//                answer += number;
//            }
//            prev = number;
//        }

//        System.out.println(answer);



    }
}
