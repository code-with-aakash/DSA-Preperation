package com.dsa.programs.designpattern.abstractfactorydesign;

public class AbstractFactoryProducer {

    public static AbstrtactFactory getProfession(boolean isTrainee){
        if(isTrainee){
            return new TraineeProfessionAbstractFactory();
        }
        else return new ProfessionAbstractFactory();
    }
}
