// Last updated: 12/08/2025, 00:10:52
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasSum(root,targetSum);
    }
    public boolean hasSum(TreeNode root,int targetSum){
        if(root==null) return false;
        if(root.left==null && root.right==null) return root.val==targetSum;
        int newTarget=targetSum-root.val;
        boolean left=hasSum(root.left,newTarget);
        boolean right=hasSum(root.right,newTarget);
        return left || right;
    }
}