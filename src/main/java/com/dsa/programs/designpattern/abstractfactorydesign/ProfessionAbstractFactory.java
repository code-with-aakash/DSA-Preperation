package com.dsa.programs.designpattern.abstractfactorydesign;

public class ProfessionAbstractFactory extends AbstrtactFactory{

    public Profession getProfession(String typeOfProfession){

        if(typeOfProfession==null){
            return null;
        }

        if(typeOfProfession.equalsIgnoreCase("Doctor")){
            return new Doctor();
        }
        if(typeOfProfession.equalsIgnoreCase("Engineer")){
            return new Engineer();
        }
        if(typeOfProfession.equalsIgnoreCase("Teacher")){
            return new Teacher();
        }

        return null;
    }
}
