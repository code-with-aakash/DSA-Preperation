package com.dsa.programs.recursion.quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {

    //    https://leetcode.com/problems/combination-sum-ii/
    public static void main(String[] args) {

        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(arr);
        List < List < Integer > > ans = new ArrayList  <>();
        List < Integer > ds = new ArrayList <>();

        sum(0, target, arr, ans, ds);

        System.out.println(ans);


    }

    private static void sum(int index, int target, int[] arr, List < List < Integer > > ans, List < Integer > ds) {


            if (target == 0) {
//                if(!ans.contains(ds)) {
                    ans.add(new ArrayList <>(ds));
//                }
                return;
            }



        for (int i = index; i < arr.length; i++) {

            

            if(arr[i]>target) {
                break;
            }

                ds.add(arr[i]);
                // here we are including the element
                sum(i+1, target - arr[i], arr, ans, ds);

                ds.remove(ds.size()-1);
            }

        }

    }

