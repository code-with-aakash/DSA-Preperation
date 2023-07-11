package com.dsa.programs.designpattern.singletondesign;

public class SingleTon {


    // 3 steps
//    1 .-> create private static instance of the class
//    2.-> make only getter no setter
//    3.-> make constructor private
    private static SingleTon singlonton_instance = new SingleTon();

    public static SingleTon getSinglonton_instance() {
        return singlonton_instance;
    }

    private SingleTon() {
    }


    public void  method(){

        System.out.println("hashcode is "+singlonton_instance);
    }
}
