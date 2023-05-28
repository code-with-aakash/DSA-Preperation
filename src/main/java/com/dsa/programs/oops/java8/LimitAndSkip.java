package com.dsa.programs.oops.java8;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {

    public static void main(String[] args) {

        List <Integer> ls = Arrays.asList(10,20,30,40,98,87,65);

        // this will print till 3 rd index
        ls.stream().limit(3).forEach(x-> System.out.print(x+" "));

        System.out.println();

        // this will skip till 5 index and prints from 6th index
        ls.stream().skip(5).forEach(x-> System.out.print(x+" "));


    }
}
