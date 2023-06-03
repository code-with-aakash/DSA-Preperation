package com.dsa.programs.recursion.quetions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    //    https://leetcode.com/problems/combination-sum-ii/
    public static void main(String[] args) {

        int[] arr = {1,3,2};
        int target = 4;
        List < List < Integer > > ans = new ArrayList <>();
        List < Integer > ds = new ArrayList <>();

        sum(0, target, arr, ans, ds);

        System.out.println(ans);


    }

    private static void sum(int index, int target, int[] arr, List < List < Integer > > ans, List < Integer > ds) {

        if(index==arr.length) {
            if (target == 0) {
                ans.add(new ArrayList <>(ds));
            }
            return;
        }

        if(arr[index]<=target) {

            ds.add(arr[index]);
            // here we are including the element
            sum(index, target - arr[index], arr, ans, ds);
            ds.remove(ds.size()-1);
        }
        // here we are not including the element
        sum(index+1, target , arr, ans, ds);

    }
}
