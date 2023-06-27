package com.dsa.programs.strings;

public class Isomorphic_7 {

    public static void main(String[] args) {

        String s ="paper";
        String t= "title";

        System.out.println(iso(s,t));

    }

    static boolean iso(String s , String t){
        int map1[]=new int[26];
        int map2[]=new int[26];

        if(s.length()!=t.length())
            return false;


        // here we check if the two String characters are in same occurence .
        // if they are not same in both array we return false else we increment value at that perticular index .
        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)-'a']!=map2[t.charAt(i)-'a'])
                return false;

            map1[s.charAt(i)-'a']=i+1;
            map2[t.charAt(i)-'a']=i+1;
        }
        return true;
    }
}
