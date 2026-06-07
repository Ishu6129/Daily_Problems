// Last updated: 6/7/2026, 1:54:18 PM
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
17    public TreeNode createBinaryTree(int[][] descriptions) {
18        Map<Integer,int[]> map=new HashMap<>();
19        Map<Integer,Boolean> isChild=new HashMap<>();
20        for(int[] i:descriptions){
21            int parent=i[0];
22            int child=i[1];
23            int idx=1-i[2];
24            if(!map.containsKey(parent)){
25                isChild.computeIfAbsent(parent,key->false);
26                map.put(parent,new int[]{-1,-1});
27                map.get(parent)[idx]=child;
28
29            }
30            else{
31                map.get(parent)[idx]=child;
32            }
33            isChild.put(child,true);
34        }
35        TreeNode root=new TreeNode();
36        for(int i:isChild.keySet()){
37            if(!isChild.get(i)){
38                root.val=i;
39                break;
40            }
41        }
42        Queue<TreeNode> q=new LinkedList<>();
43        q.add(root);
44        while(!q.isEmpty()){
45            TreeNode r=q.poll();
46            int[] nn=map.get(r.val);
47            if(nn==null) continue;
48            if(nn[0]!=-1){
49                r.left=new TreeNode(nn[0]);
50                q.add(r.left);
51            }
52            if(nn[1]!=-1){
53                r.right=new TreeNode(nn[1]);
54                q.add(r.right);
55            }
56        }
57        return root;
58    }
59}