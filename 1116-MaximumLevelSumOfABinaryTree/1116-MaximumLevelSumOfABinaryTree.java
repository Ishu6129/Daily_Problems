// Last updated: 24/08/2025, 22:48:02
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
    public int maxLevelSum(TreeNode root) {
        int maxLevel=0;
        int maxSum=Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }
        int currentLevel=1;
        while (!q.isEmpty()) {
            int lsize = q.size();
            int sum=0;
            int count = 0;
            while (count < lsize) {
                TreeNode n = q.poll();
                sum+=n.val;

                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
                count++;
            }
            if(maxSum<sum){
                maxSum=sum;
                maxLevel=currentLevel;
            }
            currentLevel++;
        }
        return maxLevel;
    }
}