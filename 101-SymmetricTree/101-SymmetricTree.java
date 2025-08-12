// Last updated: 13/08/2025, 00:19:20
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return mirrorIdentical(root.left, root.right);

    }
    private boolean mirrorIdentical(TreeNode tnode, TreeNode onode) {
		if(tnode==null && onode==null) return true;
        if(tnode==null || onode==null) return false;
        if(tnode.val!=onode.val) {return false;}
        return mirrorIdentical(tnode.left, onode.right) && 
		mirrorIdentical(tnode.right, onode.left);
	}
}