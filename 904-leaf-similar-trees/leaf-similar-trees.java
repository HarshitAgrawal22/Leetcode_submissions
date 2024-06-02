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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> root1List= new ArrayList<>();
    List<Integer> root2List= new ArrayList<>();
         inOrder(root1,root1List); inOrder(root2,root2List);

        return root1List.equals(root2List);
    }

    void inOrder(TreeNode root,List<Integer>list){
        if(root==null){
            return ;
        }
        if(root.right==null && root.left==null)
            {
                list.add(root.val);      
                System.out.println(root.val);          
            }
        else{
        inOrder(root.left,list);
        inOrder(root.right,list);
        }
    }
}