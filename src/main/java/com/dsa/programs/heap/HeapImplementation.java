package com.dsa.programs.heap;



import java.util.Arrays;

public class HeapImplementation {

    public static void main(String[] args) {

        int[] arr = {5,2,6};

        MinHeap mn = new MinHeap(3);
        mn.heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

class MinHeap{
    int[] arr;
    int cap;
    int size;

    public MinHeap(int n ) {
        this.arr = new int[n];
        this.cap = n;
        this.size = 0;
    }

    int left(int i ){
        return (2*i+1);
    }
    int right(int i ){
        return (2*i+2);
    }

    int parent (int i){
        return ((i-1)/2);
    }


    void insert(int val){

        if(cap==size) return;
        arr[size-1]=val;
        size++;

        for (int i = size-1; i !=0 && arr[parent(i)]>arr[i];) {

            int temp = arr[i];
            arr[i]=arr[parent(i)];
            arr[i]=temp;

            i=parent(i);
        }
    }

    //O(logn);
    void minHeap(int i){

        int lt = left(i);
        int rt = right(i);
        int smallest=i;
        if(lt<size && arr[lt]<arr[i]){
            smallest = lt;
        }
        if(rt<size && arr[rt]<arr[i]){
            smallest = rt;
        }
        if (smallest!=i){

            int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=arr[i];

            minHeap(smallest);
        }
    }

    int extractMin(){

        if(size==0){
            return -1;
        }
        if(size==1){
            return arr[0];
        }

        int temp =arr[0];
        arr[0]=arr[size-1];
        arr[0]=arr[size-1];
        size--;
        minHeap(0);
        return arr[size];
    }

    
    //placing value x at index i and doing min heap
    void decreaseKey(int i , int x){

        arr[i]=x;

        while (i!=0 && arr[parent(i)]>arr[i]){
            int temp =arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;

            i=parent(i);

        }

    }

    void deleteKey(int i)
    {
        // first call decrease key to place minimum value at provided index
        decreaseKey(i, Integer.MIN_VALUE);
        // call extract min to remove the minimum value from heap
        extractMin();
    }

    // as we are starting from the bottom leaf of min heap .
    // and at the bottom the index of node is size-1 and parent of node is (size-1-1)/2 .
    void buildMinheap(){
    for (int i = (size-2)/2; i >=0 ; i--) {
        minHeap(i);
    }
    }

    void heapSort(int[] arr){
        int n = arr.length;
        System.out.println("length is "+n);
        for (int i = n/2 -1; i >=0 ; i--) {
            maxHeapify(arr,n,i);
        }
        for (int i = n-1; i >=0; i--) {
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            maxHeapify(arr,i,0);
        }

    }

    void maxHeapify(int[] arr , int n , int i){

        int lt = 2*i+1; int rt = 2*i+2;
        int largest =i;
        if(lt<n && arr[largest]<arr[lt]){
            largest=lt;
        }
        if(rt<n && arr[largest]<arr[rt]){
            largest=rt;
        }

        if(largest!=i){
            int temp = arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            maxHeapify(arr,n,largest);
        }

    }



}
