package com.dsa.programs.oops;

import java.util.Arrays;

public class CustomArrayList {

    private int DEFAULT_SIZE=10;
    private int[] arr ;
    private int size =0;

    public void insert(int val){

        if(isFull()){
            resize();
        }

        arr[size++]=val;
    }

    private void resize() {

        int[] temp = new int [arr.length *2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr= temp;


    }

    private boolean isFull() {

        return size==arr.length;

    }

    public int size(){

        return size;
    }

//    public void set();
    public int get(int index){
        return arr[index];
    }



    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
