package com.dsa.programs.hashing.quetions;

import java.util.*;

public class SortingArrayByElementFrequency_2 {

    public static void main(String[] args) {

        int[] arr = {4,5,5,4,6,4,4};
        String s = "";
        char[] ch = s.toCharArray();

        HashMap<Integer,Integer> hmap = new HashMap <>();



        for (int i: arr) {

            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }

        System.out.println(hmap);

        ArrayList<Integer> arList = new ArrayList<>(hmap.keySet());

        System.out.println(arList);
        
        arList.sort((o1, o2) -> {
            if (o1.compareTo(o2) < 0)
                return -1;
            else if (o1.compareTo(o2) > 0)
                return 1;
            else
                return 0;
        });
//        arList.sort((a,b)->{
//        	return ( Objects.equals(hmap.get(a), hmap.get(b)) ? b-a:hmap.get(a)-hmap.get(b));
//        });
//        Collections.sort(arList,(a,b)->{
//            // if both are equal then return b first then return a else return a first and then b
//            return ( Objects.equals(hmap.get(a), hmap.get(b)) ? b-a:hmap.get(a)-hmap.get(b));
//        });

        System.out.println(arList);

        int[] num = new int[arr.length];
        int ind=0;
        for (int n :arList) {

            System.out.println(hmap.get(n));
            for (int i = 0; i < hmap.get(n); i++) {

                num[ind++]=n;
            }


        }

        System.out.println(Arrays.toString(num));






    }
}
