// Last updated: 7/29/2026, 9:02:52 PM
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
20        System.out.println(map);
21        int mode=1;
22        for(int key:map.keySet()){
23            mode=Math.max(mode,map.get(key));
24        }
25        List<Integer> ls=new ArrayList<>();
26        for(int key:map.keySet()){
27            if(map.get(key)==mode) ls.add(key);
28        }
29        int ans[]=new int[ls.size()];
30        for(int i=0;i<ls.size();i++) ans[i]=ls.get(i);
31        return ans;
32    }
33    public void find(TreeNode root){
34        if(root==null) return;
35        int val=root.val;
36        map.putIfAbsent(val,0);
37        map.put(val,map.get(val)+1);
38        find(root.left);
39        find(root.right);
40    }
41}