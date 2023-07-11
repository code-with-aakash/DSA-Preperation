package com.dsa.programs.array.quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class FlattenArray {
    public static void main(String[] args) {

        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        System.out.println("original: "+Arrays.deepToString(array));
        List<Integer> arr =new ArrayList<>();
        recursiveCall(array,arr);

        System.out.println(arr);
        Integer[] aj = arr.toArray(new Integer[0]);
        System.out.println(Arrays.toString(aj));;


    }

    private static void recursiveCall(Object[] array,List<Integer> arr) {

        for (int i=0;i<array.length;i++) {
            if (array[i] instanceof Object[]) {
                recursiveCall((Object[]) array[i],arr);
            }else {
                arr.add((int)array[i]);
            }

        }

    }



}
