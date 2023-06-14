package com.dsa.programs.strings;

public class ValidPalindrome {

    public static void main(String[] args) {

        String s2 = "A man, a plan, a canal: Panama abc";
        String s = s2.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0'&& s.charAt(i)<=9){
                sb.append(s.charAt(i));
            }

        }

        System.out.println(sb);

        int i = 0, j = sb.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (sb.charAt(i) != sb.charAt(j))

                System.out.println(false);

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }



    }
}
