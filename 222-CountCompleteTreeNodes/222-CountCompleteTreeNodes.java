// Last updated: 24/02/2026, 12:33:13
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
18    public int countNodes(TreeNode root) {
19        count(root);
20        return ans;
21    }
22    public void count(TreeNode root){
23        if(root==null) return;
24        ans++;
25        count(root.left);
26        count(root.right);
27    }
28}