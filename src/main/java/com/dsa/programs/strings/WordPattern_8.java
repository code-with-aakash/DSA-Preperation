package com.dsa.programs.strings;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_8 {

    public static void main(String[] args) {

        String pattern = "aba", s = "cat cat cat dog";
        System.out.println("pattern lenth"+pattern.length());
              String[] str = s.split(" ");

        Map<Object, Object> mapc = new HashMap<>();
        //here we are comparing objects

        for(int i=0;i<str.length;i++)
        {
            if(mapc.putIfAbsent(pattern.charAt(i),i)!=mapc.putIfAbsent(str[i],i)){
                System.out.println(false);
            }
        }




    }
}
