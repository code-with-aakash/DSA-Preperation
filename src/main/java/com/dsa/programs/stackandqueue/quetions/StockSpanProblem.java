package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class StockSpanProblem {

    public static void main(String[] args) {

        int[] arr = {13,15,12,14,16,8,6,4,10,30};
        Stack<Integer> st = new Stack <>();

        st.push(0);
        System.out.print(1+" ");
        for (int i = 1; i < arr.length; i++) {

            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){

                st.pop();
            }

            int span = st.isEmpty()? i+1:i-st.peek();
            System.out.print(span+" ");
            st.push(i);
        }

//        Stack<int[]> sk = new Stack <>();
//
//        sk.push(new int[]{1});
//        sk.pop();
//        sk.peek();


        // brute force solution
//        int[] arr2 = new int[arr.length];
//        arr2[0]=1;
//        for (int i = 1; i < arr.length; i++) {
//            int count=1;
//            int j =i-1;
//            while(j>=0 && arr[i]>arr[j]  ){
//
//                count++;
//                j--;
//            }
//            arr2[i]=count;
//        }
//        System.out.println(Arrays.toString(arr2));

    }


}
