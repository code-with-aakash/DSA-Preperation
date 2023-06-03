package com.dsa.programs.oops.java8;

import java.util.function.BiConsumer;

public class LambdaExpression {

    public static void main(String[] args) {


        // lambda function
        // biConsumer accepts twi integer argument and returns nothing .
        BiConsumer<Integer,Integer> bi  =(a, b) -> System.out.println(a+b);
        bi.accept(10,5);

//        LambdaExpression lm = new LambdaExpression();
//        lm.add(10,56);



    }

//    public void add (int a , int b ){
//        System.out.println(a+b);
//    }


}
