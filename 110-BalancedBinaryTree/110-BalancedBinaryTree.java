// Last updated: 08/08/2025, 23:44:02
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
    public boolean isBalanced(TreeNode root) {
        return isBalance(root).isBalanced;
    }

	private BalancedPair isBalance(TreeNode node) {
        if(node==null){
            BalancedPair sb=new BalancedPair();
            sb.height=-1;
            sb.isBalanced=true;
            return sb;
        }
        BalancedPair lbp=isBalance(node.left);
        BalancedPair rbp=isBalance(node.right);
        BalancedPair sbp=new BalancedPair();
        sbp.height=Math.max(lbp.height,rbp.height)+1;
        sbp.isBalanced=Math.abs(lbp.height-rbp.height)<=1 && lbp.isBalanced && rbp.isBalanced;
        return sbp;
	}
    private class BalancedPair {
		int height;
		boolean isBalanced;
	}
}