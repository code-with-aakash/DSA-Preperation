package com.dsa.programs.searching.binarysearch;

public class NextGreatestLetter {

    public static void main(String[] args) {

        char[] characters = {'c','f','j'};
        char target = 'c';
        System.out.println(greterElement(characters,target));



    }

    static int greterElement(char[] characters , char target){

        int s =0;
        int e = characters.length;


        while (s<=e){

            int m = s+(e-s)/2;


            if(target<characters[m]){
                e=m-1;

            }else{
                s = m+1;

            }
        }

        return characters[s% characters.length];

    }


}
