package com.dsa.programs.array.quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {


    public static void main(String[] args) {

        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(arr, (a, b) -> a[0]-b[0]); // increasing order

        for (int[] ints : arr) {

            System.out.println(Arrays.toString(ints));

        }



        for (int i = 0; i < arr.length-1; i++) {


        }

        

    }

}
