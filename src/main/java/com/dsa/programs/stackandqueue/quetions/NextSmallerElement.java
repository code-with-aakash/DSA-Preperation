package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class NextSmallerElement {

    public static void main(String[] args) {

        int[] arr = {3,10,5,1,15,10,7,6};
        Stack<Integer> st = new Stack <>();

        for (int i = arr.length-1; i >=0; i--) {

            while(!st.isEmpty() && arr[i]<=st.peek()){

                st.pop();

            }

            if(st.isEmpty()){
                System.out.print(" "+arr.length+" ");
            }else
                System.out.print(" "+st.peek()+" ");

            st.push(arr[i]);

        }

    }
}
