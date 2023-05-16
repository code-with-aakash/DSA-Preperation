package com.dsa.programs.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) throws Exception {

//        Queue<Integer> q = new LinkedList <>();
//
//        q.add(3);
//        q.add(5);
//        q.add(31);
//        q.add(39);
//        q.add(91);
//        q.add(null);
//
//        System.out.println(q.remove());
//
//        System.out.println(q.toString());

//        CustomQueue q = new CustomQueue(5);
//
//        q.insert(5);
//        q.insert(54);
//        q.insert(57);
//        q.insert(56);
//        q.insert(75);
//
//        q.display();
//
//        System.out.println(q.remove());;
//
//        q.display();


//        CircularQueue q = new CircularQueue(5);
//
//        q.insert(5);
//        q.insert(4);
//        q.insert(3);
//        q.insert(2);
//        q.insert(1);
//
//        q.display();
//
//        System.out.println(q.remove());
//
//        q.display();
//        q.insert(54);
//        q.display();

        DynamicCircularQ q = new DynamicCircularQ(5);

        q.insert(51);
        q.insert(54);
        q.insert(58);
        q.insert(59);
        q.insert(69);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.insert(99);
        q.insert(199);
        q.insert(299);
        q.display();
        System.out.println(q.remove());
        q.display();


    }
}
