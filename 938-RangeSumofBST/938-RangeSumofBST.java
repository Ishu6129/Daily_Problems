// Last updated: 8/13/2026, 11:57:27 AM
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
18    public int rangeSumBST(TreeNode root, int low, int high) {
19        find(root,low,high);
20        return ans;
21
22    }
23    public void find(TreeNode root, int low, int high){
24         if(root==null) return ;
25         if(low<=root.val && root.val<=high) ans+=root.val;
26         find(root.left,low,high);
27         find(root.right,low,high);
28    }
29}