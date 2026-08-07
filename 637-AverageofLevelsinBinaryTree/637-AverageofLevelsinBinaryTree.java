// Last updated: 8/7/2026, 9:55:34 PM
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
17    public List<Double> averageOfLevels(TreeNode root) {
18        List<Double> ans=new ArrayList<>();
19        Queue<TreeNode> q=new LinkedList<>();
20        q.add(root);
21        while(!q.isEmpty()){
22            int sz=q.size();
23            Double sm=0d;
24            for(int i=0;i<sz;i++){
25                TreeNode r=q.poll();
26                sm=sm+(double)r.val;
27                if(r.left!=null)q.add(r.left);
28                if(r.right!=null)q.add(r.right);
29            }
30            ans.add(sm/sz);
31        }
32        return ans;
33    }
34}