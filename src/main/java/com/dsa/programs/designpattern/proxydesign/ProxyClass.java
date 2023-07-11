package com.dsa.programs.designpattern.proxydesign;

public class ProxyClass extends MainClass{


    @Override
    public void print() throws Exception {

        System.out.println("im in proxy class for authorization and implementation ");
        // logic to check
        if(true) {
            super.print();
        }
        else throw new Exception ("not authorized");
    }
}
