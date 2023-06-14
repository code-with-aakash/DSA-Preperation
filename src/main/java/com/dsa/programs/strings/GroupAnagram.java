package com.dsa.programs.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static void main(String[] args) {

        String[] str={"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < str[i].length(); j++) {

                arr[i]=arr[i]+ str[i].charAt(j);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);

        }

        System.out.println(hmap);
        HashMap<String, List<String>> hm = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            String key ="";

             Arrays.sort(str[i].toCharArray());
            key = str[i];
            if(hm.containsKey(key)){
                hm.get(key).add(str[i]);
            }else {
                List<String> inls = new ArrayList<>();
                inls.add(str[i]);
                hm.put(key, inls);
            }

        }
//        List<List<String>> list = new ArrayList<>();
//
//        for (List<String> mapList : hm.values()){
//            if (mapList.size() > 1)
//                list.addAll(mapList);
//        }
        System.out.println();

        System.out.println("hm is "+new ArrayList<>(hm.values()));

    }
}
