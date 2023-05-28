package com.dsa.programs.oops.java8;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        //here first is input parameter and 2nd is return type
        Function <Integer,Integer> square= i->i*i;
        System.out.println("Square is " +square.apply(6));

    }


}
