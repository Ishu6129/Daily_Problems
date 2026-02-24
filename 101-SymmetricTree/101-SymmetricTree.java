// Last updated: 24/02/2026, 12:25:42
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
17    public boolean isSymmetric(TreeNode root) {
18        return check(root.left,root.right);
19    }
20    public boolean check(TreeNode p,TreeNode q){
21        if(q==null && p==null) return true;
22        if(q==null||p==null||q.val!=p.val) return false;
23        return check(p.left,q.right) && check(p.right,q.left);
24    }
25}