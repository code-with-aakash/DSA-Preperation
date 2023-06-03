package com.dsa.programs.oops.java8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramDemo {

    // strams are used for performaing multilpe opertions in easy way .
    public static void main(String[] args) {

        List<Integer> list = new ArrayList <>();

        list.add(15);
        list.add(150);
        list.add(5);
        list.add(2);
        list.add(11);
        list.add(9);
        list.add(8);


//        System.out.println(" list is " +sort(list));

        // sort method is reduced to below two lines
        Stream s = list.stream().filter(i -> i>20);

        s.forEach(x-> System.out.print(x+" "));

        System.out.println("break");

        // above two line converted in single line
        list.stream().filter(i -> i>20).forEach(i-> System.out.print(i+" "));

        System.out.println();
        // map function
        Stream s2 = list.stream().map(i-> i*i);

        s2.forEach(x-> System.out.print(x+" "));

        System.out.println();

        // above two line reduced to below single line
        list.stream().map(i-> i*i).forEach(x-> System.out.print(x+" "));

        System.out.println();

        list.stream().map(i->i+i).filter(i->i>50).forEach(System.out::println);

        System.out.println();



        list.stream().map(i-> i*i).distinct().sorted().forEach(System.out::println);

        System.out.println(list.stream().map(i-> i*i).count());

        System.out.println(list.stream().map(i-> i*i).distinct().max(Comparator.comparing(Integer:: valueOf)).get());


        // collection as list
        list.stream().filter(i->i>15).collect(Collectors.toList()).forEach(x-> System.out.print(x+" "));

        System.out.println();

        // sorting in stream in ascending order
        list.stream().sorted().forEach(x-> System.out.print(x+" "));

        System.out.println();

        // sort in descending order
        list.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(x-> System.out.print(x+" "));


        System.out.println();

        //minimum
        System.out.println("minimum element is "+list.stream().min((i1,i2)->i1.compareTo(i2)).get());

        // maximum
        System.out.println("maximum element is "+list.stream().max((i2,i1)->i2.compareTo(i1)).get());

        // convert stream into array
        System.out.println(Arrays.toString(list.stream().filter(i-> i<25).toArray()));

        // of method of stream to convert anything into stream
        Stream.of(1,2,3,5,0,-1,3).filter(i-> i<2).forEach(x-> System.out.print(x+" "));

        //  operation which returns no stream values are terminal operation
        // intermediate operations are lazy operations
        //


















    }

//    public static List<Integer> sort(List<Integer> list ){
//
//        List <Integer> list2=new ArrayList<>();
//        for (Integer i :list) {
//
//            if(i>15){
//                list2.add(i);
//            }
//        }
//        return list2;
//
//
//    }
}
