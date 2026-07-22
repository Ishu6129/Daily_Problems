// Last updated: 7/22/2026, 10:19:59 PM
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
17    public int sumOfLeftLeaves(TreeNode root) {
18        return calc(root,1);
19    }
20    public int calc(TreeNode root,int sd){
21        if (root==null) return 0;
22        if (root.left==null && root.right==null) {
23            return sd==0 ? root.val : 0;
24        }
25        return calc(root.left,0)+calc(root.right,1);
26    }
27}