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
class Solution {

    public boolean isUnivalTree(TreeNode root) {
        if(root!=null){
            return inOrder(root,root.val);
        }
        else{
            return true;
        }
    }

    boolean inOrder(TreeNode root,int val){
        if(root==null){
            return true;
        }
        else{
          return   inOrder(root.left,val) && (root.val == val ) &&  inOrder(root.right ,val);

        }
    }
}