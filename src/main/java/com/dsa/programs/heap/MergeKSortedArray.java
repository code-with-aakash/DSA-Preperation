package com.dsa.programs.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArray {

    public static void main(String[] args) {

        int[][] arr = {
             {1, 3},
            {2, 4, 6},
            {8, 9, 10, 11}
            };

        int k =3;
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {

            pq.add(new Pair(arr[i][0],i,0));

        }
        List <Integer> ls = new ArrayList<>();
        while(!pq.isEmpty()){

            Pair curr= pq.poll();
            ls.add(curr.data);
            System.out.println(curr.av);
            System.out.println(arr[curr.ap].length-1);

            if(curr.av<arr[curr.ap].length-1){
                System.out.println(arr[curr.ap][curr.av+1]);
                System.out.println(curr.ap);
                System.out.println(curr.av+1);
                pq.add(new Pair(arr[curr.ap][curr.av+1],curr.ap, curr.av+1));
            }


        }

        System.out.println(ls);

    }

}

class Pair implements Comparable<Pair>{

    int data ;
    int ap;
    int av;

    public Pair(int data, int ap, int av) {
        this.data = data;
        this.ap = ap;
        this.av = av;
    }

    @Override
    public int compareTo(Pair pair) {
        if(this.data<=pair.data) return -1 ;
        else return 1;
    }
}
