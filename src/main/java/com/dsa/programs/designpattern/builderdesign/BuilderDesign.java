package com.dsa.programs.designpattern.builderdesign;

public class BuilderDesign {

    public static void main(String[] args) {

        EarthQuick eq = new EarthQuick();

        Director dr = new Director(eq);

        dr.manageRequiredHome();
        Home ho=dr.getComplexObjectOfHome();

        System.out.println(ho.floor);
        System.out.println(ho);
    }

}
