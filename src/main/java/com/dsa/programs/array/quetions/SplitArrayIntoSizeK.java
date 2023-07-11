package com.dsa.programs.array.quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayIntoSizeK {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 2;
        List <List<Integer>> ls = new ArrayList<>();


        List <int[]> temp = new ArrayList<>();
        int[] inls = new int[splitSize];
        int i = 0;
        int j =0;
        for (; i < arr.length; i++) {


            inls[j]=arr[i];
            j++;
            if( (i+1)%splitSize==0){

                temp.add(inls);
                inls = new int[Math.min(splitSize, arr.length-i-1)];
                j=0;
            }


        }
        if(inls.length>0) {
            temp.add(inls);
        }


        temp.forEach(x-> System.out.println(Arrays.toString(x)));

    }
}

