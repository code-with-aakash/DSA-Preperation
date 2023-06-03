package com.dsa.programs.hashing.quetions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountFrequencies_1 {

    public static void main(String[] args) {


        List <Integer> ll = Arrays.asList(10, 20, 20, 10, 10, 20, 5, 20);

        Map<Integer,Long> coll= ll.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(coll);

        // equivalent above java 8 code
        HashMap<Integer,Integer> hmap = new HashMap <>();

        for (Integer i: ll) {

            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }

        System.out.println(hmap);

    }
}
