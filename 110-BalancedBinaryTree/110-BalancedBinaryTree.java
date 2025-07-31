// Last updated: 31/07/2025, 23:26:26
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
    private boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        checkHeight(root);
        return flag;
    }

    private int checkHeight(TreeNode root) {
        if(flag==false){
            return -1;
        }
        if (root == null) return -1;
        
        int lht = checkHeight(root.left);
        int rht = checkHeight(root.right);
        
        if(Math.abs(lht-rht)>1){
            flag=false;
        } 

        return Math.max(lht, rht) + 1;
    }
}