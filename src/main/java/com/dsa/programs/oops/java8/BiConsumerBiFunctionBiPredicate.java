package com.dsa.programs.oops.java8;

import io.netty.util.internal.chmv8.ConcurrentHashMapV8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiConsumerBiFunctionBiPredicate {

    // there is no bisupplier functional interface.
    // when you need two argument then bi functions are used
    public static void main(String[] args) {

        // it accepts two argument and return boolean value
        BiPredicate <Integer,Integer> ar = (i, j)-> (i*j)>=7;
        ar.test(5,6);

        // it accepts two argument and return the value after performing operations on it
        BiFunction<Integer,Integer,Integer> ars = (i,j) -> i*j;
        System.out.println(ars.apply(5,10));;

        // it accepts two arguments and returns nothing
        BiConsumer<Integer,Integer> bicon = (i,j)-> System.out.println("i+j is "+(i+j));
        bicon.accept(5,8);



    }
}
