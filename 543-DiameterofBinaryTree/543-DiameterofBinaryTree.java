// Last updated: 24/02/2026, 15:18:45
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
17    int d=0;
18    public int diameterOfBinaryTree(TreeNode root) {
19        find(root);
20        return d;
21    }
22    public int find(TreeNode root){
23        if(root==null) return 0;
24        int l=find(root.left);
25        int r=find(root.right);
26        d=Math.max(d,l+r);
27        return 1+Math.max(l,r);
28    }
29}