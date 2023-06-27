package com.dsa.programs.heap;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {

        int[] arr ={11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45};
        int k =3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i <k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i <arr.length ; i++) {

         if(!pq.isEmpty() && pq.peek()<arr[i]){
             pq.poll();
             pq.add(arr[i]);
         }

        }

        System.out.println(pq);

    }
}
