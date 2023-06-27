package com.dsa.programs.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static void main(String[] args) {

        int[] arr = {94, 87, 100, 11, 23, 98, 17, 35, 43, 66, 34, 53, 72, 80, 5, 34, 64, 71, 9, 16, 41, 66, 96};
        int k =19;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {


            pq.add(arr[i]);

        }

        for (int i = k; i <arr.length ; i++) {
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }

        System.out.println(pq.poll());
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
