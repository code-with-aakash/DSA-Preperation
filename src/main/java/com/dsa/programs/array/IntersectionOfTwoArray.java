package com.java.basic.programs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};

        int[] nums2 = {2, 2};

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List < Integer > h2 = new ArrayList < Integer >();

        int l = 0;
        int h = 0;

        int min = Math.min(nums1.length, nums2.length);
        int max = Math.max(nums1.length, nums2.length);


        boolean flag = false;
        if (min == nums1.length) {
            flag = true;

        }

        while (true) {

            if (l >= nums1.length || h >= nums2.length){
                break;
            }

            if (nums1[l] == nums2[h]) {
                h2.add(nums1[l]);
                l++;
                h++;
            }

           else if (nums1[l] < nums2[h]) {

                l++;
            } else if (nums1[l] > nums2[h]) {
                h++;
            }
        }





        int[] ret = new int[h2.size()];
        for(int i = 0; i < h2.size();i++){
            ret[i] = h2.get(i);
        }

        for (int i : ret) {
            System.out.print(" " + i);
        }




    }
}
