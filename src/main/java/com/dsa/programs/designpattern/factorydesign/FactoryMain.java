package com.dsa.programs.designpattern.factorydesign;

public class FactoryMain {

    public static void main(String[] args) {

        ProfessionFactory pf = new ProfessionFactory();

        Profession doc =pf.getProfession("Doctor");
        doc.print();
    }
}
