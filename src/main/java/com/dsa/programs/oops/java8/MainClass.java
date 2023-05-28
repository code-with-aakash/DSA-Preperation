package com.dsa.programs.oops.java8;

public class MainClass {

    public static void main(String[] args) {

        FunctionalInterfaceExampleImpl im = new FunctionalInterfaceExampleImpl();

        // implemented method
        im.remove();

        // default method
        im.add();
        im.rem();
        //static method directly called from interface name
        System.out.println(FunctionalInterfaceExample.res());
        System.out.println(FunctionalInterfaceExample.res2());
    }

}
