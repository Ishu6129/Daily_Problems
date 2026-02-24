// Last updated: 24/02/2026, 15:09:44
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
17    boolean flag=true;
18    public boolean isBalanced(TreeNode root) {
19        find(root);
20        return flag;
21    }
22    public int find(TreeNode root){
23        if(!flag) return 0;
24        if(root==null) return 0;
25        int l=find(root.left);
26        int r=find(root.right);
27        if(Math.abs(r-l)>1){
28            flag=false;
29        }
30        return 1+Math.max(l,r);
31    }
32}