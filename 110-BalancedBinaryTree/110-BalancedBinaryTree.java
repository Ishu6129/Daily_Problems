// Last updated: 08/02/2026, 20:54:42
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
19        check(root);
20        return flag;
21    }
22    public int check(TreeNode root){
23        if(flag==false)return -1;
24        if(root==null) return -1;
25
26        int lht=check(root.left);
27        int rht=check(root.right);
28        if(Math.abs(rht-lht)>1){
29            flag=false;
30        }
31        return 1+Math.max(lht,rht);
32    }
33}