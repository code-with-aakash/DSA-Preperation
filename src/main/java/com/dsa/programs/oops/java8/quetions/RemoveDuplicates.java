package com.dsa.programs.oops.java8.quetions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List <Integer> list = Arrays.asList(10,20,10,20,30,40,50,60,80,80,80);
        Set<Integer> set = new HashSet <>();

        // here we are entering duplicate elements in hashset and then printing it .
        list.stream().filter(x-> !set.add(x)).collect(Collectors.toSet()).forEach(x-> System.out.println(x));
    }
}
