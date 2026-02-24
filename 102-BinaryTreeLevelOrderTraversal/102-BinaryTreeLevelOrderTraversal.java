// Last updated: 24/02/2026, 12:08:59
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
17    List<List<Integer>> ans=new ArrayList<>();
18    public List<List<Integer>> levelOrder(TreeNode root) {
19        if(root==null) return ans;
20        Queue<TreeNode> q=new LinkedList<>();
21        q.add(root);
22        while(!q.isEmpty()){
23            int n=q.size();
24            List<Integer> list=new ArrayList<>();
25            for(int i=0;i<n;i++){
26                TreeNode r=q.poll();
27                list.add(r.val);
28                if(r.left!=null){
29                    q.add(r.left);
30                }
31                if(r.right!=null){
32                    q.add(r.right);
33                }
34
35            }
36            ans.add(list);
37        }
38        return ans;
39    }
40}