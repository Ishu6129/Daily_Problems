// Last updated: 8/29/2026, 12:19:12 PM
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
17    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
18        List<Integer> ls1=getLeaf(root1);
19        List<Integer> ls2=getLeaf(root2);
20        return ls1.equals(ls2);
21    }
22    public List<Integer> getLeaf(TreeNode root){
23        Stack<TreeNode> q=new Stack<>();
24        q.add(root);
25        List<Integer> ls=new ArrayList<>();
26        while(!q.isEmpty()){
27            TreeNode r=q.pop();
28            if(r.left==null && r.right==null) ls.add(r.val);
29            if(r.left!=null) q.push(r.left);
30            if(r.right!=null) q.push(r.right);
31        }
32        return ls;
33    }
34}