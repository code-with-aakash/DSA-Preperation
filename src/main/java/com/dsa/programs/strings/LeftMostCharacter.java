package com.dsa.programs.strings;

public class LeftMostCharacter {

    public static void main(String[] args) {


        String s = "geeksforgeeks";

//        for (int i = 0; i < s.length(); i++) {
//
//            for (int j = i+1; j < s.length(); j++) {
//
//                if(s.charAt(i)==s.charAt(j)){
//                    System.out.println(i);
//                    return;
//                }
//
//            }
//
//        }


        // efficient approach
        // filling the boolean array false
        // updating the array index of that boolean array as true.
        // we for index we use s.charat as it gives the value same for same character again and again
        boolean[] arr = new boolean[256];
        int res =0;
        for (int i = s.length()-1; i >=0 ; i--) {

           if(arr[s.charAt(i)]){
               res=i;
           }else {
               arr[s.charAt(i)] = true;
           }
        }
        System.out.println(res);
    }

}
