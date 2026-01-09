// Last updated: 09/01/2026, 13:37:01
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
17    public TreeNode lcaDeepestLeaves(TreeNode root) {
18        int left_height=height(root.left);
19        int right_height=height(root.right);
20        if(left_height==right_height){
21            return root;
22        }
23        if(left_height>right_height){
24            return lcaDeepestLeaves(root.left);
25        }
26        return lcaDeepestLeaves(root.right);
27    }
28    public int height(TreeNode root){
29        if(root!=null){
30            return 1+Math.max(height(root.left),height(root.right));
31        }
32        return 0;
33    }
34}