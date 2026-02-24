// Last updated: 24/02/2026, 11:54:26
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
17    List<Integer> ans=new ArrayList<>();
18    public List<Integer> preorderTraversal(TreeNode root) {
19        if(root==null) return new ArrayList<>();
20        ans.add(root.val);
21        preorderTraversal(root.left);
22        preorderTraversal(root.right);
23        return ans;
24    }
25
26}