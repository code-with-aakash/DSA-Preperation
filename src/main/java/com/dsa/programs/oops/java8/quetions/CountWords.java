package com.dsa.programs.oops.java8.quetions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {

    public static void main(String[] args) {

        String str = "Hello Welcome to code with aakash Hello aakash code";
        List <String> ls = Arrays.asList(str.split(" "));

        Map<String,Long> map =  ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        // here Function.identity() will return the value that is passed to it , if we pass hello it will return hello
        // Collectors.counting() this function will count the no of times the hello occured in string.
        // Collectors.groupingBy is same as group by in sql this will group by the values present in string.



    }
}
