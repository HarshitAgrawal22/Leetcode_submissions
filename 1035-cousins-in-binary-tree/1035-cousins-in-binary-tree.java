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
    public void help(TreeNode root,int x,int y,int[] arr,int k,TreeNode[] arr2){
        if(root==null)   return;
        if(root.left!=null){
            if(root.left.val==x){
                arr[0]=k+1;
                arr2[0]=root;
            }
            if(root.left.val==y){
                arr[1]=k+1;
                arr2[1]=root;
            }
        }
        if(root.right!=null){
            if(root.right.val==x){
                arr[0]=k+1;
                arr2[0]=root;
            }
            if(root.right.val==y){
                arr[1]=k+1;
                arr2[1]=root;
            }
        }
        help(root.left,x,y,arr,k+1,arr2);
        help(root.right,x,y,arr,k+1,arr2);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int arr[]=new int[2];
        TreeNode arr2[]=new TreeNode[2];
        help(root,x,y,arr,0,arr2);
        return arr[0]==arr[1]&&arr2[0]!=arr2[1];
    }
}