package com.dsa.programs.designpattern.singletondesign;

public class MainClass {

    public static void main(String[] args) {

        SingleTon sc = SingleTon.getSinglonton_instance();

        sc.method();;


        SingleTon st = SingleTon.getSinglonton_instance();

        st.method();;

        System.out.println(sc.equals(st));

    }
}
