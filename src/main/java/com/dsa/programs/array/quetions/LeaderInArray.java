package com.dsa.programs.array.quetions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray  {

    public static void main(String[] args) {

        int[] arr ={7,10,4,10,6,5,2};
        int n = arr.length;
        List <Integer> ls = new ArrayList<>();
        int curr_leader=arr[n-1];
        ls.add(curr_leader);

        for (int i = n-2 ; i >=0; i--) {

            if(arr[i]>curr_leader){
                curr_leader=arr[i];
                ls.add(curr_leader);

            }
        }

        Collections.reverse(ls);
        System.out.println(ls);
    }
}
