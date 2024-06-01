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
    TreeNode head;
    public TreeNode increasingBST(TreeNode root) {
        reverseOrder(root);

        return head;
    }

    void reverseOrder(TreeNode root){
        if(root==null){
            return ;
        }
        
        reverseOrder(root.right);
        head= addNode(head,root.val);
        reverseOrder(root.left);
        
    }  


    TreeNode addNode(TreeNode root,int val){
        TreeNode temp= new TreeNode(val);
        temp.left= null;
        if(root==null){
            return temp;
        }
        else{

            temp.right= root;
            root= temp;
            return root;
        }
    }
}