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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> storage= new LinkedList<>();

        Inorder(root,storage);

        for(Integer a : storage){
            if(k!=a*2){
           if(storage.contains(k-a)){
            return true;
           }}
        }
        return false;
    }
    
    boolean search(TreeNode root,int target){
        if(root==null){
            return false; 
        }
        if(root.val== target){
            return true;
        }
        if(root.val>target){
            return search(root.left,target);
        }
        else{
            return search(root.right,target);
        }

    }

    void Inorder(TreeNode root, List<Integer> storage){
        if(root== null){
            return;
        }
        else{

            Inorder(root.left,storage);
            storage.add(root.val);
            Inorder(root.right,storage);
        }
    }
}