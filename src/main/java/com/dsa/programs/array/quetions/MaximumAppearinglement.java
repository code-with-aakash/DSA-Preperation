package com.dsa.programs.array.quetions;

public class MaximumAppearinglement {

    public static void main(String[] args) {
        int[] left={1,2,4};
        int[] right = {4,5,7};
        int[] freq=new int[101];

        for (int i = 0; i < right.length; i++) {
            freq[left[i]]++;
            freq[right[i]+1]--;
        }


        int res =0;
        for (int i = 1; i < 100; i++) {
            // here we calculate prefix array
            freq[i] = freq[i-1]+freq[i];
            if(freq[i]>freq[res]){
                // the range whose frequency is greater will be our output.
                res=i;
            }

        }
        System.out.println(res);
    }




}
