package com.dsa.programs.trees;

public class ChildrenSumProperty {

    public static void main(String[] args) {

        BinarySearchtree bst = new BinarySearchtree();
        int[] arr = {14,2,12,3,9};
        bst.populate(arr);
        bst.display();
        System.out.println(bst.childrenSum());
        bst.balance();


    }
}
