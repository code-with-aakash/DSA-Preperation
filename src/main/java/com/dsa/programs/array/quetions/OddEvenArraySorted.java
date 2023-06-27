package com.dsa.programs.array.quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class OddEvenArraySorted {

    public static void main(String[] args) {

        int[] arr = {8,6,7,5,14,12,3,2,45,33,46,78,99};
        Arrays.sort(arr);
        PriorityQueue<Integer> even = new PriorityQueue <>();
        PriorityQueue<Integer> odd = new PriorityQueue <>();

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }

        System.out.println(even);
        System.out.println(odd);
        List <Integer> od = new ArrayList <>();
        boolean evenval =true;
        if(arr[0]%2==0){
            evenval =true;
        }else{
            evenval =false;
        }

        while(!even.isEmpty() && !odd.isEmpty()){
            if(evenval){
                od.add(even.poll());
                evenval=!evenval;
            }else{
                od.add(odd.poll());
                evenval=!evenval;
            }

        }
        while(!even.isEmpty()){
             od.add(even.poll());
        }
        while(!odd.isEmpty()){
            od.add(odd.poll());
        }
        System.out.println(od);

    }
}
