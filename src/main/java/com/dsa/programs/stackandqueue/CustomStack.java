package com.dsa.programs.stackandqueue;

public class CustomStack {

    protected  int[] data;
    private static final int DEFAULT_SIZE =10;

    public  CustomStack(){
        this(DEFAULT_SIZE);
    }
    public  CustomStack (int size){
        this.data = new int[size];
    }

    int ptr =-1;

    public boolean push(int item){

        if(isFull()){
            System.out.println("stack is full");
            return false;
        }

        ptr++;
        data[ptr]=item;
        return true;

    }

    public int pop () throws StackException {

        if (isEmpty()){
            throw new StackException("stack is empty");
        }

        int removed = data[ptr];
        ptr--;
        return removed;

    }

    public int peek() throws StackException {

        if (isEmpty()){
            throw new StackException("stack is empty");

        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
}
