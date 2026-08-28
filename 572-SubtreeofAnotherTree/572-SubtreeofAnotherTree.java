// Last updated: 8/28/2026, 9:52:54 PM
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
17    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
18        int target=subRoot.val;
19        Queue<TreeNode> q=new LinkedList<>();
20        q.add(root);
21        while(!q.isEmpty()){
22            TreeNode r=q.poll();
23            if(r.val==target && check(r,subRoot)){
24                return true;
25            }
26            if(r.left!=null) q.add(r.left);
27            if(r.right!=null) q.add(r.right);
28        }
29        return false;
30    }
31    public boolean check(TreeNode t1,TreeNode t2){
32        if(t1==null && t2==null) return true;
33        if(t1==null || t2==null) return false;
34        if (t1.val != t2.val) return false;
35        boolean l=check(t1.left,t2.left);
36        boolean r=check(t1.right,t2.right);
37        return l && r;
38    }
39}