package com.dsa.programs.array.medium;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaximumProductSubarray {

    public static void main(String[] args) {


        int[] nums={-3,0,1,-2};

        int max = nums[0], min = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = max;
            // store the max because before updating min your max will already be updated

            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);

            if (max > ans) {
                ans = max;
            }
        }

        System.out.println(ans);
    }
}
