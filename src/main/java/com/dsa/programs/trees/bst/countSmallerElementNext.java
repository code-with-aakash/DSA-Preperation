package com.dsa.programs.trees.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class countSmallerElementNext {

    public static void main(String[] args) {


        int[] arr ={-1,-1};



        System.out.println(Arrays.toString(arr));
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            TreeSet<Integer> ts = new TreeSet <>();
            for (int j = i+1; j < arr.length; j++) {

                ts.add(arr[j]);
            }

                int floor =0;
                if(ts.floor(arr[i])!=null && ts.floor(arr[i])>=0) {
                    floor = ts.floor(arr[i]);

                }
                ls.add(floor);
        }

        System.out.println(ls);

    }
}
