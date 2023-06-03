package com.dsa.programs.oops.java8;

@FunctionalInterface
public interface FunctionalInterfaceExample {



    // one defult metjod
    public default void add(){
        System.out.println("this is void function ");
    }

    // only 1 abstract method
    public void remove();

    // second default method
    public default void rem(){
        System.out.println("you are genius");
    }

    // one static method
    public static int res(){

        return 1;
    }

    public static int res2(){

        return 1;
    }


}
