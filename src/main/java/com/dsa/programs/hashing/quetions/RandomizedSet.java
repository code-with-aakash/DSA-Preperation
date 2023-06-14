package com.dsa.programs.hashing.quetions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RandomizedSet {

    List<Integer> ls;
    HashSet hset = new HashSet();

    public RandomizedSet() {
        hset = new HashSet<>();
        ls = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(hset.add(val)){
            ls.add(val);
            return true;
        }else {
            return false;
        }

    }

    public boolean remove(int val) {

        return hset.remove(val);
    }

    public int getRandom() {

        return ls.get(ls.size()-1);
    }

}
