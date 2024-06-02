/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        return inOrder(cloned,target.val);
        
    }

        TreeNode inOrder(TreeNode root,int val){
            if(root==null){
                return null;
            }
            else{

                if(root.val==val){
                    return root;
                }

                return   inOrder(root.left,val) ==null ?inOrder(root.right,val):inOrder(root.left,val);
            }
        }
}