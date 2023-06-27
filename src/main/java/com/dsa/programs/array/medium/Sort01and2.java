package com.dsa.programs.array.medium;

public class Sort01and2 {

    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};

        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }

        // O(n2) complexity
//        for(int i=0;i<nums.length;i++){
//
//            if(nums[i]==0){
//red++;
//            }
//            else if(nums[i]==1){
//                white++;
//            }
//            else if (nums[i]==2){
//                blue++;
//            }
//        }
//
//        System.out.println("red "+red+" white->"+white+" blue->"+blue);
//
//        for(int i=0;i<nums.length;i++){
//
//            if(i<red){
//                nums[i]=0;
//            }
//            else if(i<red +white){
//                nums[i]=1;
//            }
//            else nums[i]=2;
//        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }

    }
}
