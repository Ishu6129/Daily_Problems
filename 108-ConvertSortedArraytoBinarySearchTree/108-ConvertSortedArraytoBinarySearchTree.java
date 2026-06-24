// Last updated: 6/24/2026, 5:10:27 PM
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
17    int[] nums;
18    public TreeNode sortedArrayToBST(int[] nums) {
19        this.nums=nums;
20        return build(0,nums.length-1);
21    }
22    public TreeNode build(int left,int right){
23        if (left > right) {
24            return null;
25        }
26        int mid = left+(right-left)/2;
27        TreeNode root = new TreeNode(nums[mid]);
28        root.left = build(left,mid-1);
29        root.right = build(mid+1,right);
30        return root;
31    }
32}