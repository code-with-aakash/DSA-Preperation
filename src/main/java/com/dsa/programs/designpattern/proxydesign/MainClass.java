package com.dsa.programs.designpattern.proxydesign;

public class MainClass implements Proxy{
    @Override
    public void print() throws Exception {
        System.out.println("Im in Main Class");
    }
}
