package com.dsa.programs.stackandqueue.quetions;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowWithDeq {

    public static void main(String[] args) {

        int[] arr ={1,3,1,2,0,5};
        int k = 3;

        Deque<Integer> dq = new LinkedList <>();
        for (int i = 0; i < k; i++) {

            while (!dq.isEmpty() &&  arr[i]>=arr[dq.peekLast()] ) {

                dq.removeLast();
            }
            dq.addLast(i);
        }

        for (int j = k; j < arr.length; j++) {

            System.out.println(arr[dq.peek()]);

            while(!dq.isEmpty() && dq.peek() <= j-k){

                dq.removeFirst();
            }

            while(!dq.isEmpty() &&  arr[j]>=arr[dq.peekLast()] ){

                dq.removeLast();
            }

            dq.addLast(j);

        }
        System.out.println(arr[dq.peek()]);



        }




        /*
         brute force approach;

         int n = arr.length-k+1;


         for (int i = 0; i < arr.length && i< n; i++) {

             int max = arr[i] ;
             int z = k+i;
             for (int j = i+1; j < z  ; j++) {


                     max = Math.max(max,arr[j]);


             }
             System.out.print(" "+max+" ");


         }
        */

    }

