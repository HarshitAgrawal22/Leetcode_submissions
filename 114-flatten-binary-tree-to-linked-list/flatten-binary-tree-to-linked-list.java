/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 import java.util.*;import java.io.*;
class Solution {
    public void flatten(TreeNode root) {
        if(root == null)
            return ;
        flatten(root.left);
        if(root.left != null){
            TreeNode node= root.right;
            root.right=root.left;
            root.left=null;
            TreeNode temp=root;
            while(temp.right != null){
                temp= temp.right;
            }
            temp.right = node;
        }
        flatten(root.right);
    }


    TreeNode add(int val,TreeNode head){
        TreeNode temp= new TreeNode(val);
        temp.left= temp.right=null;
        
        if(head== null){
            head= temp;
            return head;
        }
        
        temp.right= head;
        head= temp;

        return head;
    }



    void preOrder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);

        preOrder(root.left,list);
        preOrder(root.right,list);

    }

   
    void inOrder(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        level++;
        inOrder(root.left, level);
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }

        System.out.println(root.val);
        inOrder(root.right, level);
    }
}