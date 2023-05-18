package com.dsa.programs.stackandqueue;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) throws StackException {

        Stack <Integer> st = new Stack <>();
//
//        st.setSize(2);
        st.push(1);
//        System.out.println(st.pop());
//        st.push(89);
//        st.push(89);
//        st.push(89);
//        st.push(89);
//        System.out.println(st.toString());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());

        DynamicStack stack = new DynamicStack(5);
        stack.push(43);
        stack.push(47);
        stack.push(48);
        stack.push(49);
        stack.push(49);
        stack.push(49);

//        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
