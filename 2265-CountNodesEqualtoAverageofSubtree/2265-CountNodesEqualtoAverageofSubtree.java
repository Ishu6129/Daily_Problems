// Last updated: 9/10/2026, 11:22:00 AM
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
18    public int averageOfSubtree(TreeNode root) {
19        find(root);
20        return ans;
21    }
22    public int[] find(TreeNode root){
23        if(root==null) return new int[]{0,0};
24        int[] left=find(root.left);
25        int[] right=find(root.right);
26        int sum=root.val+left[1]+right[1];
27        int count=1+left[0]+right[0];
28        if((sum/count)==root.val) ans++;
29        return new int[]{count,sum};
30    }
31}