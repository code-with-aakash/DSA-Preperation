package com.dsa.programs.strings;

public class RotationOfStrings {

    public static void main(String[] args) {


        String s1 = "ABCD";
        String s2 = "CDAB";

        if(s1.length()!=s2.length()){
            System.out.println(false);
        }
        if((s1+s1).indexOf(s2)>=0){
            System.out.println("present");
        }

    }

}
