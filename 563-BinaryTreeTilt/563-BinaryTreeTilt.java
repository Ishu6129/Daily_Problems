// Last updated: 8/8/2026, 6:49:08 PM
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
17    int ans=0;
18    public int findTilt(TreeNode root) {
19        calc(root);
20        return ans;
21    }
22    public int calc(TreeNode root){
23        if(root==null) return 0;
24        int left=calc(root.left);
25        int right=calc(root.right);
26        ans+=Math.abs(right-left);
27        return root.val+left+right;
28    }
29}