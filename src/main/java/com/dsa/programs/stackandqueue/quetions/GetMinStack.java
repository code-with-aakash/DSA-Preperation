package com.dsa.programs.stackandqueue.quetions;

public class GetMinStack {

    public static void main(String[] args) {

        StockGetMin sk = new StockGetMin();
        sk.push(-2);
        sk.push(0);
        sk.push(-3);
        System.out.println(sk.getMin());
        sk.pop();
        System.out.println(sk.top());
        System.out.println(sk.getMin());

    }

}
