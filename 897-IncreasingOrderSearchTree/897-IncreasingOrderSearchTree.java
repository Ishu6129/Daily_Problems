// Last updated: 8/10/2026, 6:02:24 PM
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
17    List<Integer> arr;
18    public TreeNode increasingBST(TreeNode root) {
19        arr=new ArrayList<>();
20        traverse(root);
21        TreeNode ansRoot=new TreeNode();
22        TreeNode dummy=ansRoot;
23        int n=arr.size();
24        for(int i=0;i<n;i++){
25            dummy.val=arr.get(i);
26            if(i<n-1){
27                TreeNode nn=new TreeNode();
28                dummy.right=nn;
29                dummy=dummy.right;
30            }
31        }
32        return ansRoot;
33    }
34    public void traverse(TreeNode root){
35        if(root==null) return;
36        traverse(root.left);
37        arr.add(root.val);
38        traverse(root.right);
39    }
40}