package com.dsa.programs.trees;

//import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;




  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Quetions {

    public List <Integer> preorderTraversal(TreeNode root) {

        List<Integer> ls = new ArrayList<Integer>();

        preOrder(root,ls);

        return ls;
    }

    public void preOrder(TreeNode node, List <Integer> ls){

        if(node==null){
            return;
        }
        ls.add(node.val);
        preOrder(node.left,ls);
        preOrder(node.right,ls);

    }
}
