package com.dsa.programs.array.quetions;

import java.util.Arrays;

public class RemoveDuplicate2 {

    public static void main(String[] args) {

        int[] nums ={1,1,1,2,2,3};



        int addIndex = 1; //index that unique characters will be inserted at
        int count =1;

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){
                //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i+1];
                addIndex++;
                count=1;
            }else if(count==1){
                nums[addIndex] = nums[i];
                addIndex++;
                count++;
            }
        }
        System.out.println(addIndex);

        System.out.println(Arrays.toString(nums));
    }
}
