package com.dsa.programs.array;

public class GoodPairs {
//    Given an array of integers nums, return the number of good pairs.

//    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    public static void main(String[] args) {

        int[] arr = {1,1,1,1};
        System.out.println(pairs(arr));

    }

    static int pairs(int[] arr ){


        int count =0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]==arr[j]){
                    count ++;

                }

            }

        }

        return count;


        }

    }

