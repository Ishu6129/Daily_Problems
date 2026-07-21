// Last updated: 7/21/2026, 7:28:16 PM
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
18    public int longestZigZag(TreeNode root) {
19        find(root.left,0,1);
20        find(root.right,1,1);
21        return ans;
22    }
23    // Left-0,Right-1
24    public void find(TreeNode root,int mv,int c){
25        if(root==null) return;
26        ans=Math.max(ans,c);
27        find(root.left,0,mv==0?1:c+1);
28        find(root.right,1,mv==1?1:c+1);
29    }
30}