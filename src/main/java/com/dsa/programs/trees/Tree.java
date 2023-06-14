package com.dsa.programs.trees;

import java.util.Scanner;

public class Tree {

    public Tree() {
    }

    public static class  Node {

        int value;
        Node left;
        Node right;


        public Node(int value) {
            this.value = value;
        }

    }
    private Node root;

        public void populate(Scanner scanner){

            System.out.println("enter the root node");
            int value = scanner.nextInt();
            root = new Node(value);

            populate(scanner,root);

        }

        public void populate (Scanner scanner,Node node){

            System.out.println("Do you want to enter to the left of "+node.value);
            boolean left = scanner.nextBoolean();
            if(left){
                System.out.println("Enter the value of left of "+node.value);
                int value = scanner.nextInt();
                node.left= new Node(value);
                populate(scanner,node.left);
            }

            System.out.println("Do you want to enter to the right of "+node.value);
            boolean right = scanner.nextBoolean();
            if(right){
                System.out.println("Enter the value of right of "+node.value);
                int value = scanner.nextInt();
                 node.right= new Node(value);
                populate(scanner,node.right);
            }

        }

        public void display(){
            display(root,"");
        }
        public void display(Node node , String indent){

            if (node == null) {

                return;
            }
            System.out.println(indent+node.value);
            display(node.left,indent+"\t");
            display(node.right,indent+"\t");

        }

        public void prettyDisplay(){
            prettyDisplay(root,0);
        }

        public void prettyDisplay(Node node,int level){

            if(node==null){
                return;
            }
            prettyDisplay(node.right,level+1);

            if(level!=0){
                for (int i = 0; i < level-1; i++) {
                    System.out.print("|\t\t");

                }
                System.out.println("|---->"+node.value);
            }
            else{
                System.out.println(node.value);
            }

            prettyDisplay(node.left,level+1);
        }



}

class Mainclass{
    public static void main(String[] args) {
        Tree tr = new Tree();
        Scanner sc = new Scanner(System.in);
        tr.populate(sc);
//        tr.display();
        tr.prettyDisplay();

    }
}