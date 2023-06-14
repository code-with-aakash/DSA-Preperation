package com.dsa.programs.array.quetions;

import java.util.Arrays;

public class LastWordLength {

    public static void main(String[] args) {

        String s = "   fly me   to   the moon        ";
//        String[] str = s.split(" ");
        String str =s.trim();
        System.out.println(str.charAt(str.length()-1));
//        System.out.println(Arrays.toString(str));;

//        System.out.println(str[str.length-1].length());
    }
}
