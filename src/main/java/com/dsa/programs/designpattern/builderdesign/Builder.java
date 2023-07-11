package com.dsa.programs.designpattern.builderdesign;

public interface Builder {

    public void buildFloor();

    public void buildWalls();

    public void buildTerrace();

    public Home getComplexHomeObject();
}
