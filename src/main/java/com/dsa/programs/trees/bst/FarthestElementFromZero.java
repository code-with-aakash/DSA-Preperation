package com.dsa.programs.trees.bst;

import java.util.Arrays;
import java.util.TreeSet;

public class FarthestElementFromZero {
    public static void main(String[] args) {

        int[] arr = {-2,-4,-5,3,1,2};
        System.out.println(Arrays.toString(arr));

        System.out.println(farthestElement(arr));

    }

    private static int farthestElement(int[] Arr) {

        TreeSet <Integer> ts = new TreeSet<Integer>();
        for (int i=0; i<Arr.length; i++){
            ts.add(Arr[i]);
        }
        int maxV = ts.last();
        int minV = ts.first();

        if(Math.abs(minV)>=maxV){
            return minV;
        }
        return maxV;
    }
}
