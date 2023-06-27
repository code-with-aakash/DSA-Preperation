package com.dsa.programs.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKSortedArray {

    public static void main(String[] args) {

        int[] arr ={9,8,7,19,18};
        int k =2;


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <=k ; i++) {
            pq.add(arr[i]);

        }

        int index =0;
        for (int i = k+1; i <arr.length ; i++) {
            if(!pq.isEmpty()) {
                arr[index++] = pq.poll();
            }
            pq.add(arr[i]);

        }

        while (!pq.isEmpty()){
            arr[index++]=pq.poll();
        }

        System.out.println(Arrays.toString(arr));


    }
}
