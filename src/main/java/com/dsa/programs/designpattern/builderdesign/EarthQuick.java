package com.dsa.programs.designpattern.builderdesign;

public class EarthQuick implements Builder{

    private Home earthResistance = new Home();

    @Override
    public void buildFloor() {
        this.earthResistance.floor="wooden floor";
    }

    @Override
    public void buildWalls() {
        this.earthResistance.walls="wooden waal";
    }

    @Override
    public void buildTerrace() {
        this.earthResistance.terrace="wooden";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.earthResistance;
    }
}
