package com.dsa.programs.oops.java8.quetions;

import java.util.function.BiFunction;

public class MainClass {

    public static void main(String[] args) {

        MultiplyTwoNoUsingFunctionalInterface fi = (a,b)->(a*b);

        System.out.println(fi.multiply(7,8));

        // using bifunction
        BiFunction<Integer,Integer,Integer> bifi = (a,b)->(a*b);
        System.out.println(bifi.apply(7,8));

    }


}
