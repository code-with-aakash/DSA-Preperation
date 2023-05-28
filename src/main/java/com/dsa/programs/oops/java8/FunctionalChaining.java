package com.dsa.programs.oops.java8;

import java.util.function.Function;

public class FunctionalChaining {

    public static void main(String[] args) {

        Function<Integer,Integer> doble = i->2*i;
        System.out.println("Square is "+doble.apply(3));

        Function<Integer,Integer> qube = i->i*i*i;
        System.out.println("qube is "+qube.apply(3));

        // here it first double value then calculate cube of it
        System.out.println("first square and then qube " +doble.andThen(qube).apply(3));

        // here it first cube it then calculate the double
        System.out.println("first qube and then square " +doble.compose(qube).apply(3));

    }
}
