// Last updated: 24/02/2026, 11:52:56
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> ans=new ArrayList<>();
19        find(root,ans);
20        return ans;
21    }
22    public void find(TreeNode root,List<Integer> ans){
23        if(root==null) return;
24        ans.add(root.val);
25        find(root.left,ans);
26        find(root.right,ans);
27    }
28
29}