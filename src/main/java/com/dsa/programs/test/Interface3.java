package com.dsa.programs.test;

public interface Interface3 extends Interface1,Interface2{

    @Override
    void m1();

    public static void main(String[] args) throws Exception {

        InterfaceImpl m = new InterfaceImpl();

        System.out.println("life");
        m.m1();

    }
}
