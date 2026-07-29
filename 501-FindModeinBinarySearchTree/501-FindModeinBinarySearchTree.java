// Last updated: 7/29/2026, 9:03:02 PM
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
17    HashMap<Integer,Integer> map=new HashMap<>();
18    public int[] findMode(TreeNode root) {
19        find(root);
20        int mode=1;
21        for(int key:map.keySet()){
22            mode=Math.max(mode,map.get(key));
23        }
24        List<Integer> ls=new ArrayList<>();
25        for(int key:map.keySet()){
26            if(map.get(key)==mode) ls.add(key);
27        }
28        int ans[]=new int[ls.size()];
29        for(int i=0;i<ls.size();i++) ans[i]=ls.get(i);
30        return ans;
31    }
32    public void find(TreeNode root){
33        if(root==null) return;
34        int val=root.val;
35        map.putIfAbsent(val,0);
36        map.put(val,map.get(val)+1);
37        find(root.left);
38        find(root.right);
39    }
40}