package com.dsa.programs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums1 = {3,2,3};
        Arrays.sort(nums1);
        int count=0;


        List < Integer > h2 = new ArrayList < Integer >();
        HashMap<Integer,Integer> hmap = new HashMap < Integer, Integer >();

        int l = 0;
        int h = 0;



        System.out.println("count is -->"+count);

        int[] ret = new int[h2.size()];
        for(int i = 0; i < h2.size();i++){
            ret[i] = h2.get(i);
        }

        for (int i : ret) {
            System.out.print(" " + i);
        }

    }
}
