package com.dsa.programs.stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Deques {

    public static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque <>();
        q.add(55);
        q.add(45);
        q.add(35);
        q.add(25);
        q.add(15);
        System.out.println(q.remove());
//        q.add(null);
        q.addFirst(54);
        q.addLast(59);
        System.out.println(q.removeFirst());


        System.out.println(q.toString());


    }
}
