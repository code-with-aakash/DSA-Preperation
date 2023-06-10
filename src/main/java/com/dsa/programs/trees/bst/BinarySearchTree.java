package com.dsa.programs.trees.bst;

import java.util.*;

public class BinarySearchTree {

    static class Node{

        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }


    }

    private Node root;

    public void insert(int val){

       root= insert(root,val);
    }

    public Node insert(Node node ,int val){

        if(node==null){
            return new Node(val);
        }

        if(val<node.value){
            node.left=insert(node.left,val);
        }

        if(val>node.value){
            node.right=insert(node.right,val);
        }

        return node;

    }


    public boolean search(int val){

        return search(root,val);

    }

    public boolean search(Node node , int val){

        if(node ==null ) return false;

        if(node.value==val){
            return true;
        }else if(val<node.value){
           return search(node.left,val);
        }else if(val>node.value){
           return search(node.right,val);
        }

        return false;
    }

    public Node delete (int val){

        return delete(root,val);
    }

    public Node delete(Node curr , int val){

        if(curr==null){
            return null;
        }
        if(curr.left!=null && curr.left.value==val){
            curr.left=null;
            return curr;
        }
        if(curr.right!=null && curr.right.value==val){
            curr.right=null;
            return curr;
        }
        if(val<curr.value){
            return   delete(curr.left,val);
        }
        else if(val>curr.value){
         return   delete(curr.right,val);
        }
        return curr;
    }


//    As to delete the node we replace it with its left or right node .
//            1 . when u delete node whose left is null then replace node with right .
//2 . when u delete node whose right is null then replace node with left .
//	``` if(root.left==null) return node.right;
//            else if(node.right==null) return node.left; ```
//
//            else below part will be executed.
//3 . if u delete node whose both left and right node is present like u delete root node then we need to find successor( closest greater value) of this  .
//            4 . then you need to move to right side of tree and go in left direction till left is not null .
//            5 . as we need greater value then root hence moving to right side .but not much greater hence moving to left tree.
//    private Node getSucc(Node node) {```
//```
//        Node curr = node.right;
//        while(curr!=null && curr.left!=null){
//            curr=curr.left;
//        }
//        return curr;
//    }
//```
//        ```

    public Node eficientDelete(int val){

        return eficientDelete(root,val);


    }

    public Node eficientDelete(Node node,int val){

        if(node==null) return null;


        if(val<node.value){
            node.left=   eficientDelete(node.left,val);
        }
        else if(val>node.value){
            node.right=   eficientDelete(node.right,val);
        }else{

            if(root.left==null) return node.right;
            else if(node.right==null) return node.left;
            else{
                Node succ = getSucc(node);
                node.value=succ.value;
                node.right=eficientDelete(node.right,succ.value);

            }

        }
        return node;

    }

    private Node getSucc(Node node) {
        Node curr = node.right;
        while(curr!=null && curr.left!=null){
            curr=curr.left;
        }
        return curr;

    }

    public void display(){
        display(root,"Root node is : ");
    }

    public void display(Node node, String intend){

        if(node==null){
            return;
        }

        System.out.println(intend+node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");


    }

    public void populate(int[] arr) {

        for (int j : arr) {
            this.insert(j);
        }
    }

    // Floor in BST

    public int floorInBst(int val){

        return floorInBst(root,val);

    }

    public int floorInBst(Node node,int val){
        int res = 0;

        while(node!=null){

            if (node.value == val) {

                return node.value;
            }else if(node.value>val){
                node = node.left;
            }else {
                res=node.value;
                node=node.right;
            }
        }
        return res;
    }

    public int ceilInBst(int val){

        return ceilInBst(root,val);

    }

    public int ceilInBst(Node node,int val){
        int res = -1;

        while(node!=null){

            if (node.value == val) {

                return node.value;
            }else if(node.value<val){
                node = node.right;
            }else {
                res=node.value;
                node=node.left;
            }
        }
        return res;
    }

    public List< List <Integer> > closestNode(List < Integer > arr){

        return closestNode(root,arr);
    }

    public List< List <Integer> > closestNode(Node node,List < Integer > arr){

        List<List<Integer>> outerls = new ArrayList <>();
        Node bacup =node;
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> ls = new ArrayList <>();
            node=bacup;

            int floor=-1;
            int ciel=-1;
            while(node!=null){
                if (node.value == arr.get(i)) {
                    floor= arr.get(i);
                    ciel=arr.get(i);
                    break;
                }else if(node.value>arr.get(i)){

                    floor=node.value;
                    node=node.left;
                }else {

                    ciel=node.value;
                    node=node.right;
                }
            }
            ls.add(floor);
            ls.add(ciel);
            outerls.add(ls);
        }
        return outerls;
    }

    // check NST

    Node root1 = new Node(2147483647);
    public boolean checkBst(){

//        return checkBst(root1,Long.MIN_VALUE,Long.MAX_VALUE);
            return checkBst2(root);
    }

    public boolean checkBst(Node node , Long min , Long max ){

        if(node ==null ){
            return true;
        }

        return node.value>min && node.value<max && checkBst(node.left,min, (long) node.value) &&checkBst(node.right, (long) node.value,max);

    }

    // efficient
    // a binary tree can be binary search tree if inorder traversal of binary tree is sorted
    int prev = Integer.MIN_VALUE;
    public boolean checkBst2(Node node){

        if(node ==null ) return true;

        if(!checkBst2(node.left)) {
            return false;
        }
        if(node.value<=prev) return false;

        prev = node.value;

        return checkBst2(node.right);

    }

    // fix bst efficient solution

//    here the approach is
//    we travel the tree in inorder traversal as in inorder traversal elements must be  in sorted order . hence if we find violation of the rule then we swap those nodes .
//    it appears in 2 scenario's .
// 1. in 1st scenario we find out the first second and middle node where first and second are the elements which are in wrong position so we swap them .
// 2 . in 2nd scenario the first and middle elements are in wrong position and hence we swap them .


    Node pre =null,first=null,second=null,middle=null;

    public void recoverTree(Node node) {

        fix(node);
        if( first != null && second != null )
        {
            int temp = first.value;
            first.value = second.value;
            second.value = temp;
        }
        // Adjacent nodes swapped

        else  if( first != null && middle != null )
        {
            int temp = first.value;
            first.value = middle.value;
            middle.value = temp;
        }
    }

    public void fix (Node node){
        if(node==null){
            return;
        }

        fix(node.left);
        if(pre!=null && node.value< pre.value){

            if(first==null){
                first = pre;
                middle = node;
            }else {
                second = node;
            }

        }

        pre=node;
        fix(node.right);
    }


    public boolean twoSum(int sum){
        HashSet<Integer> hs= new HashSet<>();
        return twoSum(root,sum,hs);
    }


    public boolean twoSum(Node node,int sum,HashSet<Integer> hs){


        if(node==null) return false;

        if(twoSum(node.left,sum,hs)){
            return true;
        }

        if(hs.contains(sum-node.value)){
            return true;
        }else
            hs.add(node.value);

        return twoSum(node.right,sum,hs);
    }

    public void verticalTraversal(){
        TreeMap <Integer,Integer> tmap = new TreeMap<>();
        verticalTraversal(root,0,tmap);

        for(Map.Entry < Integer, Integer > m: tmap.entrySet()){

            System.out.print(" "+m.getValue());

        }
        System.out.println();


    }

    public void verticalTraversal(Node node,int hd,TreeMap <Integer,Integer> tmap){

        if(node ==null ){
            return;
        }
        verticalTraversal(node.left,hd-1,tmap);
        int psum = (tmap.get(hd)==null) ? 0:tmap.get(hd);
        tmap.put(hd,psum+node.value);
        verticalTraversal(node.right,hd+1,tmap);

    }


    public void verticalTraversal2(){
        TreeMap <Integer,List<Integer>> tmap = new TreeMap<>();
        List<List<Integer>> ls = new ArrayList <>();
        verticalTraversal2(root,0,tmap,ls);

        for(Map.Entry < Integer, List<Integer >> m: tmap.entrySet()){

            System.out.print(" "+m.getValue());

        }


    }

    public void verticalTraversal2(Node node,int hd,TreeMap <Integer,List<Integer>> tmap,List<List<Integer>> ls ){


        if(node ==null ){
            return ;
        }
        verticalTraversal2(node.left,hd-1,tmap,ls);
        List<Integer> psum = (tmap.get(hd)==null) ? new ArrayList<>():tmap.get(hd);
            psum.add(node.value);
            tmap.put(hd, psum);

        verticalTraversal2(node.right,hd+1,tmap,ls);
    }

    // efficient solution.
    class Pair{

        Node node;
        int hd;

        Pair(Node n , int h ){
            this.node=n;
            this.hd=h;
        }
    }

    public void verticalTraversal2(Node node,TreeMap <Integer,List<Integer>> tmap ){

        Queue < Pair > q = new LinkedList <>();
        q.add(new Pair(node,0));


        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            if(tmap.containsKey(hd)){
                tmap.get(hd).add(curr.value);

                // Collections.sort(tmap.get(hd).subList(1, tmap.get(hd).size()));

            }
            else{
                List<Integer> al = new ArrayList<>();
                al.add(curr.value);
                tmap.put(hd,al);
            }
            if (curr.left != null) {
                q.add(new Pair(curr.left,hd-1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right,hd+1));
            }
        }
    }


    // top view of bst
    // here the horizontal distance who are getting overlapped are ignore
        public void topTraversal(){
            TreeMap <Integer,List<Integer>> tmap = new TreeMap<>();
            topTraversal(root,tmap);
            System.out.println("top traversal");

            for(Map.Entry < Integer, List<Integer> > m: tmap.entrySet()){

                System.out.print(" "+m.getValue());

            }
            System.out.println();



        }
    public void topTraversal(Node node,TreeMap <Integer,List<Integer>> tmap ){

        Queue < Pair > q = new LinkedList <>();
        q.add(new Pair(node,0));


        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            if(!tmap.containsKey(hd)){

                List<Integer> al = new ArrayList<>();
                al.add(curr.value);
                tmap.put(hd,al);
            }
            if (curr.left != null) {
                q.add(new Pair(curr.left,hd-1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right,hd+1));
            }
        }
    }


    // bottom view
    public void bottomTraversal(){
        TreeMap <Integer,Integer> tmap = new TreeMap<>();
        bottomTraversal(root,tmap);
        System.out.println("bottom traversal");
        for(Map.Entry < Integer, Integer > m: tmap.entrySet()){
            System.out.print(" "+m.getValue());
        }
    }
    public void bottomTraversal(Node node,TreeMap <Integer,Integer> tmap ){
        Queue < Pair > q = new LinkedList <>();
        q.add(new Pair(node,0));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            tmap.put(hd, curr.value);
            if (curr.left != null) {
                q.add(new Pair(curr.left,hd-1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right,hd+1));
            }
        }
    }


    // burn a bst from leaf node

    public int deleteBst(int val){

        return minTime(root,val);

    }


    public void getParent(Node node,Node parent,Map<Node,Node> map){

        if(node==null) return;
        map.put(node,parent);

        getParent(node.left,node,map);
        getParent(node.right,node,map);

    }

    Node n1=null;

    public void getNode(Node node,int a){

        if(node==null) return ;

        if(node.value==a){
            n1=node;
        }
        getNode(node.left,a);
        getNode(node.right,a);

    }

    public int getmaxDis(Node node ,int dis,Map<Node,Integer> vis,Map<Node,Node> map){

        if(node==null){
            return dis-1;
        }

        if(vis.containsKey(node)){
            return Integer.MIN_VALUE;
        }

        vis.put(node,1);

        int a1=Integer.MIN_VALUE,a2=Integer.MIN_VALUE,a3=Integer.MIN_VALUE;

        // check if there is left node
        a1=getmaxDis(node.left,dis+1,vis,map);

        // check if there is any right node
        a2=getmaxDis(node.right,dis+1,vis,map);

        // find parent of node
        a3=getmaxDis(map.get(node),dis+1,vis,map);

        return Math.max(Math.max(a1,a2),a3);
    }

    public int minTime(Node node,int target){

        Map<Node,Node> par = new HashMap <>();
        getParent(node,null,par);

        getNode(node,target);
        Map<Node,Integer> vis = new HashMap<>();

        return getmaxDis(n1,0,vis,par);

    }


}

class Main{
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        int[] arr ={6,2,13,1,4,9,15,14};
        bst.populate(arr);
        bst.display();
        System.out.println(bst.search(20));
        System.out.println(bst.search(80));
        System.out.println(bst.search(8));
        System.out.println(bst.floorInBst(10));
        System.out.println(bst.ceilInBst(600));
//        System.out.println(bst.eficientDelete(20));
//        bst.display();
//        System.out.println(bst.eficientDelete(60));
//        bst.display();
//        System.out.println(bst.eficientDelete(40));
//        bst.display();
//        int[] q = {2,5,16};
        List<Integer> ls =Arrays.asList(2,5,16);
        System.out.println(bst.closestNode(ls));
        System.out.println(bst.checkBst());
        bst.verticalTraversal();
        System.out.println();
        bst.verticalTraversal2();
        System.out.println();
        bst.topTraversal();
        System.out.println();
        bst.bottomTraversal();
        System.out.println();
        System.out.println(bst.deleteBst(14));

    }
}
