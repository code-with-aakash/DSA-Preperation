package com.dsa.programs.oops;

import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) throws CloneNotSupportedException {

//        int[] arr2 = {1,2,3,4,5};
        Demo dm = new Demo(32,"aakash",1000000);

        dm.setAge(45);
//        int[] arr3 = {10,20,30};



        Demo str = (Demo) dm.clone();
         str.arr[0]=0;

        System.out.println(Arrays.toString(dm.arr));
        System.out.println(Arrays.toString(str.arr));



    }
}
