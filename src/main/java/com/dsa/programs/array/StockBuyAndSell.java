package com.java.basic.programs.array;

public class StockBuyAndSell {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int max=0,min=prices[0];

        if (min < prices[1]) {
            max = Math.max(prices[1] - min, max);
            System.out.println("maximum is " + max);
        } else
            min = prices[1];
        System.out.println("minimum is " + min);

        if (min < prices[2]) {
            max = Math.max(prices[2] - min, max);
            System.out.println("maximum is " + max);
        } else
            min = prices[2];
        System.out.println("minimum is " + min);

        if (min < prices[3]) {
            max = Math.max(prices[3] - min, max);
            System.out.println("maximum is " + max);
        } else
            min = prices[3];
        System.out.println("minimum is " + min);

        if (min < prices[4]) {
            max = Math.max(prices[4] - min, max);
            System.out.println("maximum is " + max);
        } else
            min = prices[4];
        System.out.println("minimum is " + min);

        if (min < prices[5]) {
            max = Math.max(prices[5] - min, max);
            System.out.println("maximum is " + max);
        } else
            min = prices[5];
        System.out.println("minimum is " + min);

    }
    }

