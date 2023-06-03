package com.dsa.programs.oops.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SuuplierFunction {

    public static void main(String[] args) {

        // supplier function accepts no argument and only returns the output whatever you pass in it .
        // no chaining is required in supplier functional interface.

        Supplier< Date> ar = Date::new;

        System.out.println(ar.get());

    }



}
