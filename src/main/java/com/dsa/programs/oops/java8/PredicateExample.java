package com.dsa.programs.oops.java8;

import java.util.function.Predicate;

public class PredicateExample {


    // predicate returns boolean return value only it can accept integer string object in input.
    public static void main(String[] args) {

        Predicate<String> checkLength = s -> s.length()>5;
        System.out.println("length of string is greater than 5 "+checkLength.test("attendence"));


        Predicate<String> checkEven = s -> (s.length()&1)==0;


        // you can combine two predicate
        System.out.println("joining and predicate "+checkEven.and(checkLength).test("aakash"));

        System.out.println("joining or predicate "+checkEven.or(checkLength).test("aak"));

        // you can negate only 1 predicate
        System.out.println("negate predicate reverse the result "+checkEven.negate().test("aakas"));

    }
}
