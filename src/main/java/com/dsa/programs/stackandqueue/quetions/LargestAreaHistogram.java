 package com.dsa.programs.stackandqueue.quetions;

 import java.util.Stack;

/*
        Intuition:
        here we calculate Area by calculating the length between the largest left element and largets right element of array index and multiplying that by hieht of the index element.

        Approach:
        Approach is we are calculating the area of rectangle while popping the element out from the stack .
        step 1 : Run the for loop from i 0 to length of array
        step 2 : As first as stack is empty we push the index of first element in stack .
        step 3 : now check if stack is empty or not and after that check if the element in array with index present in stack is greater or not if it is greater pop the index .
        step 4 : now calculate the area by

        formula: curr = arr[temp]*(sk.isEmpty()?i:(i-sk.peek()-1))
        a.here temp is the index you popped out from the stack .
        b.I will be the index of current element which is smaller than the peak index element from array .
        c.sk.peek is the index which is the top element which is left in the stack after you pop the top index from stack
        d. if after you pop the index from stack and stack becomes empty means there is no element greater than the current element hence return the current element height by i*arr[temp].
        e. else calculate the index with the formula (i-sk.peek()-1)
        and calculate area by multiplying the index with arr[temp]
        f. now do the same for all elements of array and return the maximum result obtained .
        h . in the last we are calculating the area of elements left in the stacks and for them the largest element on right side is the length of array hence formula is
        (n-sk.peek()-1))
        */

public class LargestAreaHistogram {

//    solution : https://leetcode.com/problems/largest-rectangle-in-histogram/solutions/3535392/simple-java-solution-with-stack/
    public static void main(String[] args) {

        int[] arr ={2,4};

        System.out.println(efficientSolution(arr,arr.length));

//        int[] arr2 =previousSmallest(arr);
//        int[] arr3=nextSmallest(arr);
//        System.out.println(Arrays.toString(arr2));;
//        System.out.println(Arrays.toString(arr3));;
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//
//            int curr = (arr3[i]-arr2[i]-1);
//            if(curr<0){
//                curr = -1*curr;
//            }
//            max = Math.max(max,arr[i]*curr);
//
//        }
//
//        System.out.println(max);


    }

    static int[] previousSmallest(int[] arr){

        int[] arr2= new int[arr.length];
        Stack<Integer> st = new Stack <>();
//        st.setSize(8);
        for (int i = 0; i < arr.length; i++) {


//            here we are checking if top element is greater than a[i] then we remove top element
            while(!st.isEmpty() && arr[st.peek()] >=arr[i]){
//                System.out.print(" "+st.peek());
                st.pop();
            }

            //here if stack is empty we insert -1 as initially there is no smaller element than arr[0]
            if(st.isEmpty()){
//                System.out.print(" -1");
                arr2[i]=-1;

            }else {
                // here we print the peek element i.e smaller element
//                System.out.print(" " + st.peek());
                arr2[i]=st.peek();
            }


            // here we push the element in stack
            st.push(i);
        }

        st.toString();
        return arr2;
    }

    static int[] nextSmallest(int[] arr){
        Stack <Integer> st = new Stack <>();
        int[] arr3 = new int[arr.length];

        for (int i = arr.length-1; i >=0; i--) {

            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
//                System.out.print("-1"+" ");
                arr3[i]=arr.length;

            }else {
//                System.out.print(" " + st.peek() + " ");
                arr3[i]=st.peek();
            }

            st.push(i);

        }
        System.out.println("stack is "+ st);
        return arr3;
    }

    static int efficientSolution(int[] arr , int n ){

        Stack<Integer> sk = new Stack <>();
        int res = 0 ;
        for (int i = 0; i < n; i++) {

            while(!sk.isEmpty() && arr[sk.peek()]>=arr[i]){

                int temp = sk.pop();
                int curr = arr[temp]*(sk.isEmpty()?i:(i-sk.peek()-1));
                res = Math.max(res,curr);

            }

            sk.push(i);

        }

        while(!sk.isEmpty()){

            int temp = sk.pop();
            int curr = arr[temp]*(sk.isEmpty()?n:(n-sk.peek()-1));
            res = Math.max(res,curr);
        }

        return res;
    }
}


