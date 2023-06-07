package com.dsa.programs.hashing;

import java.util.ArrayList;
import java.util.LinkedList;


class HashDemo{

    public static void main(String[] args) {

        MyHash hs = new MyHash(7);
        hs.insert(10);
        hs.insert(20);
        hs.insert(21);
        hs.insert(49);
//        hs.insert(20);
//        hs.insert(20);
        System.out.println(hs.table);
        System.out.println(hs.search(10));
        System.out.println(hs.search(5));
        System.out.println(hs.remove(10));
        System.out.println(hs.remove(20));




    }
}
 class MyHash {

    int bucket ;
    ArrayList<LinkedList<Integer>> table ;


     public MyHash(int b ) {
        this.bucket = b;
        this.table = new ArrayList<>(b);

        for (int i = 0; i < b; i++) {

            table.add(new LinkedList <>());

        }
    }

    void insert(int key){

        int i = key%bucket;
        table.get(i).add(key);

    }


     boolean remove () {
         return remove(0);
     }

     boolean remove (int key){


        int i = key % bucket;
       return table.get(i).remove((Integer)key);
    }

    boolean search(int key){
        int i = key%bucket;
       return table.get(i).contains(key);

    }
}
