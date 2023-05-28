package com.dsa.programs.oops.java8;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

    // consumer never return anything its void return type it accepts only 1 argument .
    public static void main(String[] args) {

        Consumer<Integer> square = i-> System.out.println(i*i);
        square.accept(5);

        Consumer<Integer> doble = i-> System.out.println(2*i);
        doble.accept(5);

        square.andThen(doble).accept(5);

    }
}
