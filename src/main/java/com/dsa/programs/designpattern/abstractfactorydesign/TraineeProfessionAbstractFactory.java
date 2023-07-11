package com.dsa.programs.designpattern.abstractfactorydesign;

public class TraineeProfessionAbstractFactory extends AbstrtactFactory{

    public Profession getProfession(String typeOfProfession){

        if(typeOfProfession==null){
            return null;
        }

       else if(typeOfProfession.equalsIgnoreCase("Doctor")){
            return new TraineeDoctor();
        }
       else if(typeOfProfession.equalsIgnoreCase("Engineer")){
            return new TraineeEngineer();
        }
        else if(typeOfProfession.equalsIgnoreCase("Teacher")){
            return new TraineeTeacher();
        }

        return null;
    }
}
