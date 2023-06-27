package com.dsa.programs.array.quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayIntoSizeK {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;
        List <List<Integer>> ls = new ArrayList<>();



        for(int i=0;i<arr.length;i+=splitSize){
            System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, Math.min(arr.length,i+splitSize))));
        }


        List<int[]> list = new ArrayList<>();
        for(int i=0;i<arr.length;i+=splitSize){
            list.add(Arrays.copyOfRange(arr, i, Math.min(arr.length,i+splitSize)));
        }

        /*for (int i = 0; i < arr.length; i=i+splitSize) {
            int k=0;
            List<Integer> inls = new ArrayList <>();

            for (int j = i; j < i+splitSize && j< arr.length; j++) {

            inls.add(arr[j]);

            }
            ls.add(inls);
        }*/

        ls.forEach(lsarr-> System.out.println(lsarr));

    }
}

