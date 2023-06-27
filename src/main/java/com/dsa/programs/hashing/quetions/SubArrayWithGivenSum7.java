package com.dsa.programs.hashing.quetions;

import java.util.HashSet;

public class SubArrayWithGivenSum7 {



    public static void main(String[] args) {

        int[] arr ={1,2,3};
        int sum =3;

        HashSet<Integer> hset = new HashSet<>();

        int pre_sum=0;
        int count=0;
        for (int j : arr) {

            if (j == sum) {
                count++;
                System.out.println("true");
            }
            pre_sum += j;

            if (hset.contains(pre_sum - sum)) {
                System.out.println("true");
                count++;
            }
            if (pre_sum == sum) {
                count++;
                System.out.println("true");
            }

            hset.add(pre_sum);
        }
        System.out.println(count);
    }

}
