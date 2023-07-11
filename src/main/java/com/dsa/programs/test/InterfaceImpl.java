package com.dsa.programs.test;

public class InterfaceImpl implements Interface1,Interface2 {

    @Override
    public void m1() throws Exception{

        System.out.println("interface");

    }

    public static void main(String[] args) throws Exception {

        InterfaceImpl m = new InterfaceImpl();
        m.m1();

    }
}
