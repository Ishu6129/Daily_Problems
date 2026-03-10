// Last updated: 10/03/2026, 10:58:37
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ans=new ArrayList<>();
19        if(root==null) return ans;
20        Queue<TreeNode> q=new LinkedList<>();
21        q.add(root);
22        int level=-1;
23        while(!q.isEmpty()){
24            int s=q.size();
25            level++;
26            List<Integer> ls=new ArrayList<>();
27            for(int i=0;i<s;i++){
28                TreeNode r=q.poll();
29                ls.add(r.val);
30                if(r.left!=null){
31                    q.add(r.left);
32                }
33                if(r.right!=null){
34                    q.add(r.right);
35                }
36            }
37            if(level%2==0){
38                ans.add(ls);
39            }
40            else{
41                Collections.reverse(ls);
42                ans.add(ls);
43            }
44        }
45        return ans;
46    }
47}