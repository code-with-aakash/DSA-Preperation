package com.dsa.programs.heap;

import java.util.PriorityQueue;

public class MaximumItemWithGivenSum {

    public static void main(String[] args) {

        int[] arr={1, 12, 5, 111, 200, 1000, 10 };
        int sum = 50;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int j : arr) {
            pq.add(j);
        }
        int count=0;
        while (!pq.isEmpty() && pq.peek()<=sum){
            if(pq.peek()<=sum) {
                sum -= pq.poll();
                count++;
            }

        }
        System.out.println(count);
    }
}
