package com.dsa.programs.designpattern.prototypedesign;

import java.util.Hashtable;

public class ProfessionCache {

    private static Hashtable<Integer,Profession> pf = new Hashtable<>();

    public static Profession getCloneNewProfession(int id) throws CloneNotSupportedException {
        Profession cachedProfessionInstance = pf.get(id);
        return (Profession)cachedProfessionInstance.clone();
    }

    public static void loadProfessionCache(){

        Doctor doc = new Doctor();
        doc.id=1;
        pf.put(doc.id,doc);

        Engineer eg = new Engineer();
        eg.id=2;
        pf.put(eg.id,eg);

        Teacher tc = new Teacher();
        tc.id=3;
        pf.put(tc.id,tc);



    }
}
