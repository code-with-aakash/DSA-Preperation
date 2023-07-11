package com.dsa.programs.designpattern.prototypedesign;

public abstract class Profession implements Cloneable{

    public int id;


    abstract void print();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
