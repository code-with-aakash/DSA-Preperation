package com.dsa.programs.trees;

import java.util.*;

class BinarySearchtree {

    public class Node {

        private int value;
        private Node left;
        private Node right;

        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BinarySearchtree() {
        super();
    }

    public int height(Node node) {

        if (node == null) {
            return 0;
        }
        return 1+ Math.max(height(node.left),height(node.right));
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {

        display(root, "Root Node : ");
    }

    public void display(Node node, String details) {

        if (node == null) {
//            System.out.println("null");
            return ;
        }

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");


    }

    public void insert(int value) {
        root = insert(value, root);

    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    // naive solution O(n*n)
    public boolean balance() {

        return balance(root);
    }

    private boolean balance(Node node) {

        if (node == null) {
            return true;
        }
        // this is not proper need some modification
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balance(node.left) && balance(node.right);
    }

    // efficient solution O(n)
    public int balance2() {

        return balance2(root);
    }
    // In a Balanced Binary Tree for every node, the difference between
    // heights of left subtree and right subtree should not be more than one.
    private int balance2(Node node) {

        // if any of the part of trees either left or right is -1 we return -1.
        //-1 means tree is not balanced else it is balanced
        if (node == null) {
            return 0;
        }
        int lf = height(node.left);
        if(lf==-1){
            return -1;
        }
        int rt = height(node.right);
        if(-1 == rt){
            return -1;
        }

        if(Math.abs( lf-rt  )>1) {return -1;}
        // here we are returning the height of the tree
        else return Math.max(lf,rt)+1;
    }

    public void populate(int[] arr) {

        for (int j : arr) {
            this.insert(j);
        }
    }


    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(Node node) {

        if (node == null) {
            return;
        }
        // this is root node
        System.out.print(node.value + " , ");
        preOrder(node.left);
        preOrder(node.right);

    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " , ");
        inOrder(node.right);

    }





    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(Node node) {

        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " , ");

    }

    // in this we are decreasing the k value from root and when it reaches 0 we print the element .
    // k must be less than or equal to height of tree
    public void printkDist(int k) {
        printkDist(root, k);
    }

    public void printkDist(Node node, int k) {

        if (node == null) {
            return;
        }
        if (k == 0) {
            System.out.print(node.value + " ");
        } else {
            printkDist(node.left, k - 1);
            printkDist(node.right, k - 1);
        }

    }

    public void levelOrderTraversal() {
        levelOrderTraversal(root);
    }

    public void levelOrderTraversal(Node node) {
        Queue < Node > q = new LinkedList <>();
        q.add(node);

        while (!q.isEmpty()) {

            // removes the top element of queue
            Node curr = q.poll();
            System.out.print(curr.value + " ");
            if (curr.left != null) {
                q.add(curr.left);

            }
            if (curr.right != null) {
                q.add(curr.right);

            }
        }

    }


    public void levelOrderTraversalLinebyLine() {
        levelOrderTraversalLinebyLine(root);

    }




    public void levelOrderTraversalLinebyLine(Node node) {
        Queue < Node > q = new LinkedList <>();
        q.add(node);
        q.add(null);

        while (q.size()>1) {

            Node curr = q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print( " "+curr.value );
            if (curr.left != null) {
                q.add(curr.left);

            }
            if (curr.right != null) {
                q.add(curr.right);
                int max = Integer.MIN_VALUE;

            }
        }
    }

    public void levelOrderTraversalLinebyLine2() {
        levelOrderTraversalLinebyLine2(root);
    }

    public void levelOrderTraversalLinebyLine2(Node node) {
        Queue < Node > q = new LinkedList <>();
        q.add(node);
        int max =0;

        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                System.out.print(" "+curr.value);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            max=Math.max(max,count);
            System.out.println();
        }
        // maximum width of tree
        System.out.println("maximum is "+max);
    }

    // naive solution
    public int sizeOfTree(){
        return sizeOfTree(root);
    }
    public int sizeOfTree(Node node){

        if(node==null){
            return 0;
        }

        return 1+sizeOfTree(node.left)+sizeOfTree(node.right);

    }

    // efficient solution

    public int sizeOfTree2(){
        return sizeOfTree2(root);
    }
    public int sizeOfTree2(Node node){

        int lh=0,rh=0;

        Node curr = node;
        while(curr!=null){
            lh++;
            curr=curr.left;
        }
        curr=node;
        while(curr!=null){
            rh++;
            curr=curr.right;
        }

        if(lh==rh) return (int) (Math.pow(2, lh) - 1);
        else return 1+sizeOfTree2(node.left)+sizeOfTree2(node.right);

    }


    public int maximum(){
    return    maximum(root,0);
    }

    public int maximum(Node node,int max){

        if(node==null){
            return max;
        }

        if(node.value>max){
            max=node.value;
        }

        return Math.max(maximum(node.left,max),maximum(node.right,max)) ;


    }


    public int minimum(){

        return    minimum(root,Integer.MAX_VALUE);
    }

    public int minimum(Node node,int min){

        if(node==null){
            return min;
        }

        if(node.value<min){
            min=node.value;
        }

        return Math.min(minimum(node.left,min),minimum(node.right,min)) ;


    }
//    Left View: A simple solution is to notice that the nodes appearing in the left view of the binary tree are the first nodes at every level.
//    So, the idea is to do a level order traversal of the binary tree using a marker to identify levels and print the first node at every level


    public void leftBinaryTree(){
         leftBinaryTree(root,1);
    }
    int maxlevel=0;
    public void leftBinaryTree(Node node,int level){

        if(node==null){
            return;
        }
        if(maxlevel<level){
            System.out.print(node.value+" ");
            maxlevel=level;
        }
        leftBinaryTree(node.left,level+1);
        leftBinaryTree(node.right,level+1);
    }

    public void rightBinaryTree(){
        rightBinaryTree(root,1);
    }
    int rightlevel=0;
    public void rightBinaryTree(Node node,int level){

        if(node==null){
            return;
        }
        if(rightlevel<level){
            System.out.print(node.value+" ");
            rightlevel=level;
        }

        rightBinaryTree(node.right,level+1);
        rightBinaryTree(node.left,level+1);
    }



    public boolean childrenSum(){
        return  childrenSum(root);
    }

    // here the idea is single node is true as it has no left and right node
    // if both left and right node is null then also it is true
    // we calculate left sum and right sum and calculate node value if both are same check for the left and right recursively
    public boolean childrenSum(Node node){

        if(node==null){
            return true;
        }

        if(node.left==null && node.right==null){
            return true;
        }

        int sum =0;
        if(node.left!=null){
            sum+=node.left.value;
        }
        if(node.right!=null){
            sum+=node.right.value;
        }

        return(sum==node.value && childrenSum(node.left) && childrenSum(node.right));
    }

    // BT to DLL
    public Node BtToDll() {
        System.out.println(BtToDll(root));
        return BtToDll(root);
    }

    Node prev =null;

    public Node BtToDll(Node root) {

        // Base case
        if (root == null)
            return root;

        // Recursively convert left subtree
        Node head =BtToDll(root.left);

         // Now convert this node
        if (prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        // Finally convert right subtree
        BtToDll(root.right);
        return head;
    }

    public void BtToLL() {

        BtToLL(root);
        printList(root);


    }
    void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.value + " ");
            node = node.right;
        }
    }



    public void BtToLL(Node root) {


        if (root == null) return ;

        Node left = root.left;
        Node right = root.right;

        root.left = null;

        BtToLL(left);
        BtToLL(right);

        root.right = left;
        Node cur = root;
        while (cur.right != null) cur = cur.right;
        cur.right = right;

    }


    public int diameterOftree(){
        return diameterOftree(root);
    }

    public int diameterOftree(Node node){

        if(node==null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        int d1 = 1+left+right;
        return Math.max(d1,Math.max(diameterOftree(node.left),diameterOftree(node.right)));

    }

    // efficient solution which computes heights and diameter at same time
    public int height2(){
        return height2(root);
    }
    //this res variable is our diameter
    int res=0;
    public int height2(Node node){

       if(node==null){
            return 0;
        }

        int lh = height2(node.left);
        int rh = height2(node.right);

        res= Math.max(res,lh+rh+1);
        System.out.print("response is "+res);
        return 1+Math.max(lh,rh);

    }

    // minimum depth

    public int minDepth(){
        return minDepth(root);
    }

    public int minDepth(Node root) {

        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;


    }



        // efficient solution

    public int minDepth2() {

        return minDepth2(root);
    }
    public int minDepth2(Node root) {

            if (root == null) {
                return 0;
            }
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(root);
            int depth = 1;
            while(!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node curr = queue.removeFirst();
                    if (curr.left == null && curr.right == null) {
                        return depth;
                    }
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
                depth++;
            }

            return depth;
    }



    // inorder preorder traversal to binary tree construction
//    Pick an element from Preorder. Increment a Preorder Index Variable (preIndex in below code) to pick the next element in the next recursive call.
//    Create a new tree node tNode with the data as the picked element.
//    Find the picked element’s index in Inorder. Let the index be inIndex.
//    Call buildTree for elements before inIndex and make the built tree as a left subtree of tNode.
//    Call buil dTree for elements after inIndex and make the built tree as a right subtree of tNode.
//            return tNode
//


    public Node inOrderPreOrderToBt(int[] in,int[] pre){

        return inOrderPreOrderToBt( in, pre,0, pre.length-1);
    }

    int preIndex=0;
    public Node inOrderPreOrderToBt(int[] in,int[] pre,int instr,int inend) {

        if (instr > inend) {
            return null;
        }


        int index=0;
        Node node = new Node(pre[preIndex++]);
        for (int i = instr; i <= inend; i++) {
            if(in[i]==node.value) {
                index = i;
                break;
            }
        }
        node.left = inOrderPreOrderToBt(in,pre,instr,index-1);
        node.right = inOrderPreOrderToBt(in,pre,index+1,inend);
        return node;

    }
    public Node inOrderPreOrderToBt2(int[] in,int[] pre){
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0; i < in.length; i++)
        {
            mp.put(in[i], i);
        }

        return inOrderPreOrderToBt2( in, pre,0, pre.length-1,mp);
    }

    int preIndex2=0;
    public Node inOrderPreOrderToBt2(int[] in,int[] pre,int instr,int inend,HashMap<Integer,Integer> mp) {

        if (instr > inend) {
            return null;
        }

        Node node = new Node(pre[preIndex2++]);
        int index=0;

        index=mp.get(node.value);

        node.left = inOrderPreOrderToBt2(in,pre,instr,index-1,mp);
        node.right = inOrderPreOrderToBt2(in,pre,index+1,inend,mp);
        return node;

    }

    // tree traversal in Spiral form

    public void spiralTraversal(){

        spiralTraversal(root);
    }

    public void spiralTraversal(Node node){

        Queue < Node > q = new LinkedList <>();
        q.add(node);
        int max =0;
        Stack<Integer> st = new Stack <>();
        boolean reverse=false;

        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();

                if(reverse){
                    st.push(curr.value);
                }else{
                System.out.print(" "+curr.value);
                }


                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            if(reverse) {
                while (!st.isEmpty()) {
                    System.out.print(" " + st.pop() + " ");
                }
            }
            reverse=!reverse;
            System.out.println();
        }

    }

    // LCA of Binary Tree
    public int lca(int n1, int n2){

        return lca(root,n1,n2);
    }

    public int lca(Node node,int n1, int n2){

        List <Integer> path_1 = new ArrayList<>();
        List <Integer> path_2 = new ArrayList<>();

        if(findPath(path_1,n1,node)==false || findPath(path_2,n2,node)==false){
            // cant find lca
            return -1;
        }


        for (int i = 0; i < path_1.size()&& i<path_2.size(); i++) {

            if(path_1.get(i)== path_2.get(i)){
                return path_1.get(i);
            }
        }

    return -1;

    }

    private boolean findPath(List< Integer> path, int n, Node node) {

    if(node==null){
        return false;
    }
    path.add(node.value);

    if(node.value==n){
        return true;
    }
    if(findPath(path,n,node.left)||findPath(path,n,node.right)){
        return true;
    }

    path.remove(path.size()-1);
    return false;

    }

    // LCA efficient solution
    // here assumption is both n1 and n2 should be present in tree else it will give wrong answer
    public int lcaEfficient(int n1,int n2){

        return lcaEfficient(root,n1,n2).value;
    }

    public Node lcaEfficient(Node node,int n1,int n2){

        if(node==null) return null;

        if(node.value==n1||node.value==n2){
            return node;
        }

        Node lca1 = lcaEfficient(node.left,n1,n2);
        Node lca2 = lcaEfficient(node.right,n1,n2);

        if(lca1!=null && lca2!=null) return node;

        if(lca1!=null ){
            return lca1;
        }else
            return lca2;
    }

    // serialization of binary tree into arraylist
    List<Integer> ls = new ArrayList<>();
    public void serializationToList(){

        serializationToList(root,ls);
        System.out.println(ls);
    }

    public void serializationToList(Node node,List<Integer> ls){

        if(node==null){
            ls.add(-1);
            return;
        }

        ls.add(node.value);
        serializationToList(node.left,ls);
        serializationToList(node.right,ls);

    }

    // deserialization to binary tree

    public Node deserialization(){
        return deserialization(ls);
    }

    int i=0;
    public Node deserialization(List<Integer> ls){

        if(i==ls.size()) return null;

        int val = ls.get(i++);

        if(val==-1) return null;

        Node node = new Node(val);
        node.left = deserialization(ls);
        node.right=deserialization(ls);
        return node;

    }

}

class Main {
    public static void main(String[] args) {

        BinarySearchtree bst = new BinarySearchtree();
        int[] arr = {3,2,15,12,10,30,2,22};
        bst.populate(arr);
        bst.display();
        System.out.println(bst.balance());
        System.out.println(bst.isEmpty());
        bst.preOrder();
        System.out.println();
        bst.inOrder();
        System.out.println();
        bst.postOrder();
        System.out.println();
        bst.printkDist(3);
        System.out.println();
        bst.levelOrderTraversal();
        System.out.println( );
        bst.levelOrderTraversalLinebyLine();
        System.out.println();
        bst.levelOrderTraversalLinebyLine2();
        System.out.println();
        System.out.println(bst.sizeOfTree());
        System.out.println(bst.sizeOfTree2());
        System.out.println();
        System.out.println(bst.maximum());
        System.out.println("left binary tree");
        bst.leftBinaryTree();
        System.out.println();
        bst.rightBinaryTree();
//        System.out.println(bst.BtToDll());
        System.out.println("binary tree to LinkedList");
        bst.BtToLL();
        System.out.println(bst.diameterOftree());
        System.out.println(bst.height2());
        int[] inorder = {9,3,15,20,7}, postorder = {3,9,20,15,7};
//        bst.display(bst.inOrderPreOrderToBt(inorder,postorder),"Root Node : ");
        bst.display(bst.inOrderPreOrderToBt2(inorder,postorder),"Root Node : ");
        bst.spiralTraversal();
        System.out.println("LCA is "+bst.lca(15,3));
        System.out.println("LCA efficient is "+bst.lcaEfficient(15,7));
        bst.serializationToList();
        bst.display(bst.deserialization(),"ROOT node is :");


    }
}
