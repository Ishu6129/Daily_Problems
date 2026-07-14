// Last updated: 7/14/2026, 8:54:15 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if(root==null) return null;
14        if(root==p || root==q) return root;
15        TreeNode left=lowestCommonAncestor(root.left,p,q);
16        TreeNode right=lowestCommonAncestor(root.right,p,q);
17        if(left==null) return right;
18        else if(right==null) return left;
19        return root;
20    }
21}