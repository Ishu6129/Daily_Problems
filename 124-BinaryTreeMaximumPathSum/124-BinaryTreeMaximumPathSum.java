// Last updated: 24/02/2026, 15:50:40
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans=Integer.MIN_VALUE;
18    public int maxPathSum(TreeNode root) {
19        PathSum(root);
20        return ans;
21    }
22    public int PathSum(TreeNode root){
23        if(root==null) return 0;
24        int l=Math.max(0,PathSum(root.left));
25        int r=Math.max(0,PathSum(root.right));
26        ans=Math.max(ans,l+r+root.val);
27        return root.val+Math.max(l,r);   
28    }
29}