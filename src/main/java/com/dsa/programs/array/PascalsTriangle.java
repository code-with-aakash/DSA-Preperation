package com.java.basic.programs.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args){

int numRows=5;
        List<List<Integer>> res = new ArrayList();
        List<Integer> row = new ArrayList();
        for(int i = 0; i < numRows; i++) {
            for(int j = row.size() - 1; j >= 1 ; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
            res.add(new ArrayList(row));
        }
    }




}
