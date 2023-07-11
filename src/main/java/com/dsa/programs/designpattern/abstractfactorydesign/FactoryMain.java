package com.dsa.programs.designpattern.abstractfactorydesign;

public class FactoryMain {

    public static void main(String[] args) {

        // to choose what u want trainee factory
        AbstrtactFactory af = AbstractFactoryProducer.getProfession(true);

        Profession pf = af.getProfession("Engineer");
        pf.print();

        // here we are creating non trainee factory
        AbstrtactFactory ppf = AbstractFactoryProducer.getProfession(false);

        Profession plf = ppf.getProfession("Engineer");
        plf.print();

    }
}
