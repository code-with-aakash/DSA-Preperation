package com.dsa.programs.strings;

public class PatternSearching_3 {

    public static void main(String[] args) {

        String n = "ABCDABCD";
        String m = "ABCD";
        int nl=n.length();
        int ml=m.length();

        // time complexity O((n-m+1)*m)
        // auxillary space O(1)

        for (int i = 0; i <= n.length()-m.length(); i++) {
            int j=0;
            for ( j = 0; j < m.length(); j++) {
                if(m.charAt(j)!=n.charAt(i+j)){
                    break;
                }
            }
            if (j == m.length()) {
                System.out.println(" patern present at "+i);
            }
        }

        // efficient solution
        // assume pattern characters are distinct.

        for (int i = 0; i <= n.length()-m.length(); ) {
            int j=0;
            for ( j = 0; j < m.length(); j++) {
                if(m.charAt(j)!=n.charAt(i+j)){
                    break;
                }
            }
            if (j == m.length()) {
                System.out.println(" patern present at "+i);
            }

            if(j==0){
                i++;
            }
            else{
                i=i+j;
            }
        }


    }
}
