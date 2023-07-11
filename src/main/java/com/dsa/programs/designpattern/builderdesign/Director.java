package com.dsa.programs.designpattern.builderdesign;

public class Director {

    private Builder builder;

    public Director(Builder builderType){
        this.builder = builderType;
    }

    public Home getComplexObjectOfHome(){
        return this.builder.getComplexHomeObject();
    }

    public void manageRequiredHome(){
        this.builder.buildFloor();
        this.builder.buildWalls();
        this.builder.buildTerrace();
    }
}
