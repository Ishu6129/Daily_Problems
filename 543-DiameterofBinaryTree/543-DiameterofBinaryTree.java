// Last updated: 31/07/2025, 23:00:29
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
    private int maxDiameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return maxDiameter;
    }
    
    private int calculateHeight(TreeNode root) {
        if (root == null) return -1;
        
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        
        int currentDiameter = leftHeight + rightHeight+2;
        maxDiameter = Math.max(maxDiameter, currentDiameter);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
