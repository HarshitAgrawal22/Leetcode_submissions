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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        if(root1==null){
            return root2;

        }

        if(root2==null){
            return root1;
        }


        TreeNode newNode=addNode(root1,root2);
        return newNode;
    }

    TreeNode addNode(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null){
            return null;
        }
        if(r1==null){
            TreeNode temp= new TreeNode(r2.val);
            temp.right= addNode(null,r2.right);
            temp.left= addNode(null,r2.left);
            return temp;
        }
        if(r2==null){
            TreeNode temp= new TreeNode(r1.val);
            temp.right= addNode(r1.right,null);
            temp.left= addNode(r1.left,null);
            return temp;
        }

        else{
            TreeNode temp= new TreeNode(r1.val+r2.val);
            
            temp.left=addNode(r1.left,r2.left);
            temp.right=addNode(r1.right,r2.right);
            return temp;
        }
    }
}