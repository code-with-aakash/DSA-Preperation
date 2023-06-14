package com.dsa.programs.strings;

import java.util.Arrays;

public class AnagramSearch {

    public static void main(String[] args) {

        String s ="dcda";
        String p = "adc";

//        for (int i = 0; i <= s.length() - p.length(); i++) {
//
//            if(aragram(s,p,i)){
//                System.out.println(true);
//                break;
//            }
//
//        }
//        System.out.println(false);


        // efficient solution

        int[] ct= new int[256];
        int[] cp = new int[256];

        for (int i = 0; i < p.length() && i < s.length(); i++) {

            ct[s.charAt(i)]++;
            cp[p.charAt(i)]++;

        }


        for (int i = p.length(); i < s.length(); i++) {
            if(arrsame(ct,cp)){
                System.out.println(true);

            }
            ct[s.charAt(i)]++;
            ct[s.charAt(i-p.length())]--;

        }
        
        
    }

    private static boolean arrsame(int[] ct, int[] cp) {

        return Arrays.equals(ct,cp);

    }

    private static boolean aragram(String s, String p, int i) {

        int[] freq = new int[26];
        for (int j = 0; j < p.length(); j++) {
            freq[s.charAt(i+j) - 'a']--;
            freq[p.charAt(j) - 'a']++;

        }

        for (int j = 0; j < freq.length; j++) {

            if(freq[j]>0){
                return false;
            }
        }



        return true;
    }

    

    

}
