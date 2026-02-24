// Last updated: 24/02/2026, 11:48:49
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
18    public int sumRootToLeaf(TreeNode root) {
19        find(root,"");
20        return ans;
21    }
22    public void find(TreeNode root,String str){
23        if(root==null) return;
24        str+=root.val;
25        if(root.left==null && root.right==null){
26            ans+=Integer.parseInt(str,2);
27            return ;
28        }
29        find(root.left,str);
30        find(root.right,str);
31    }
32}