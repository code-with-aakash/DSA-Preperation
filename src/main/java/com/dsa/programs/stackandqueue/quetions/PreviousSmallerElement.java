package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class PreviousSmallerElement {

    public static void main(String[] args) {

        int[] arr={4,10,5,8,20,15,3,12};
        Stack<Integer> st = new Stack <>();
//        st.setSize(8);
        for (int j : arr) {


//            here we are checking if top element is greater than a[i] then we remove top element
            while (!st.isEmpty() && st.peek() >= j) {
//                System.out.print(" "+st.peek());
                st.pop();
            }

            //here if stack is empty we insert -1 as initially there is no smaller element than arr[0]
            if (st.isEmpty()) {
                System.out.print(" -1");

            } else
                // here we print the peek element i.e smaller element
                System.out.print(" " + st.peek());

            // here we push the element in stack
            st.push(j);
        }


    }
}
