package com.dsa.programs.hashing;

public class OpenAddressing {

    public static void main(String[] args) {

        MyHashOpen ms = new MyHashOpen(7);
        System.out.println(ms.insert(49));
        System.out.println(ms.insert(50));
        System.out.println(ms.insert(63));
        System.out.println(ms.search(63));
        System.out.println(ms.delete(63));
        System.out.println(ms.delete(63));
    }


}

class MyHashOpen{

    int[] arr;
    int cap ,size;

    public MyHashOpen( int cap) {

         arr = new int[cap];
        this.cap = cap;
        this.size = 0;
        for (int i = 0; i < cap; i++) {
            arr[i]=-1;
        }
    }

    int hash (int key){
        return key % cap;
    }

    public boolean search(int key){

        int h = hash(key);
        int i=h;

        // here if next element is -1 means no more values present to it next as this is linear prob
        while(arr[i]!=-1){

            // here if key is found return the true
            if(arr[i]==key){
                return true;
            }
            i= (i+1)%cap;

            // here i reaches to h again by traversing whole array in circular
            if(i==h){
                return false;
            }
        }

        return false;

    }

    public boolean insert(int key){

        if(size==cap){
            // as size is full can not insert more values
            return false;
        }

        int i = hash(key);

        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key) {

            // to linearly add key to next index if current index is not empty.
            i = ( i + 1 ) % cap;
        }
            if(arr[i]==key){
                return false;
            }
            else{
                arr[i]=key;
                size++;
                return true;
            }



    }

    public boolean delete(int key){

        int h = hash(key);
        int i=h;
        while(arr[i]!=-1 ) {


            if (arr[i] == key) {
                arr[i] = -2;
                return true;
            }
            i=(i+1)%cap;
            if(i==h){
                return false;
            }
        }
        return false;

    }

}
