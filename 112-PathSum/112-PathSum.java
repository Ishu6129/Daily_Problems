// Last updated: 12/08/2025, 00:14:08
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
        return hasSum(root,targetSum,0);
    }
    public boolean hasSum(TreeNode root,int targetSum,int sum){
        if(root==null) return false;
        sum+=root.val;
        if(root.left==null && root.right==null) return sum==targetSum;
        boolean left=hasSum(root.left,targetSum,sum);
        boolean right=hasSum(root.right,targetSum,sum);
        return left || right;
    }
}