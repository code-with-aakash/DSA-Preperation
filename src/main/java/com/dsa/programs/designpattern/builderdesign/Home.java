package com.dsa.programs.designpattern.builderdesign;

public class Home {

    public String floor;
    public String walls;
    public String terrace;

    @Override
    public String toString() {
        return "Home{" +
                "floor='" + floor + '\'' +
                ", walls='" + walls + '\'' +
                ", terrace='" + terrace + '\'' +
                '}';
    }
}
