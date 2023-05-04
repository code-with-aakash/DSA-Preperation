package com.dsa.programs.array;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {

    public static void main(String[] args) {


    int[] candies = {2,3,5,1,3} ;

    int extraCandies = 3;

        System.out.println(maxCandies(candies,extraCandies));

    }

    static List< Boolean> maxCandies (int[] arr , int extraCandies){

        int max = Integer.MIN_VALUE;
        List < Boolean > ls = new ArrayList<>();

        for (int i =0;i<arr.length;i++){

            max = Math.max(arr[i],max);

        }

        for (int j =0;j<arr.length;j++){

            if(arr[j]+extraCandies>=max){
                ls.add(true);
            }
            else
                ls.add(false);

            }
        return ls;

        }



    }
