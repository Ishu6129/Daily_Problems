// Last updated: 7/14/2026, 9:53:51 PM
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
17    StringBuilder s1;
18    StringBuilder s2;
19    public String getDirections(TreeNode root, int startValue, int destValue) {
20        TreeNode rt=lowestCommonAncestor(root,startValue,destValue);
21        TreeNode startNode=find_sn(rt,startValue,new StringBuilder(""));
22        TreeNode desttNode=find_en(rt,destValue,new StringBuilder(""));
23        return (s1.append(s2)).toString();
24    }
25    public TreeNode find_sn(TreeNode root,int target,StringBuilder sb){
26        if(root==null) return null;
27        if(root.val==target){
28            s1=new StringBuilder(sb); 
29            return root;
30        }
31        TreeNode left=find_sn(root.left,target,sb.append("U"));
32        sb.deleteCharAt(sb.length()-1);
33        TreeNode right=find_sn(root.right,target,sb.append("U"));
34        sb.deleteCharAt(sb.length()-1);
35        if(left==null) return right;
36        return left;
37    }
38    public TreeNode find_en(TreeNode root,int target,StringBuilder sb){
39        if(root==null) return null;
40        if(root.val==target){
41            s2=new StringBuilder(sb); 
42            return root;
43        }
44        TreeNode left=find_en(root.left,target,sb.append("L"));
45        sb.deleteCharAt(sb.length()-1);
46        TreeNode right=find_en(root.right,target,sb.append("R"));
47        sb.deleteCharAt(sb.length()-1);
48        if(left==null) return right;
49        return left;
50    }
51    public TreeNode lowestCommonAncestor(TreeNode root,int p,int q) {
52        if(root==null) return null;
53        if(root.val==p || root.val==q) return root;
54        TreeNode left=lowestCommonAncestor(root.left,p,q);
55        TreeNode right=lowestCommonAncestor(root.right,p,q);
56        if(left==right) return left;
57        else if(left==null) return right;
58        else if(right==null) return left;
59        return root;
60    }
61}