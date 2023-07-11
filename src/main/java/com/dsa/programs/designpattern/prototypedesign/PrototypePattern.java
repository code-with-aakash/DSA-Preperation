package com.dsa.programs.designpattern.prototypedesign;

public class PrototypePattern {


//    Steps
    // step 1 :-> create ProfessionCache class which will have hastable where we put the object with key value pair
    // like for doctor the id will be 1 and object will be new Doctor();
    // step 2 :-> load the map in the main class and call the get instance method of this ProfessionCache class
    // this will return you the clone of the first object .
    // it will not create the new object .
    // the Profession class will have id and it will implement clonable interface to clone the object.
    // this clone method is used by the Professioncache class for creating onject clone in getCloneNewProfession method



    public static void main(String[] args) throws CloneNotSupportedException {

        ProfessionCache.loadProfessionCache();

        Profession doc = ProfessionCache.getCloneNewProfession(1);
        System.out.println(doc);

        Profession eng = ProfessionCache.getCloneNewProfession(2);
        System.out.println(eng);

        Profession doc2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(doc2);



    }
}
