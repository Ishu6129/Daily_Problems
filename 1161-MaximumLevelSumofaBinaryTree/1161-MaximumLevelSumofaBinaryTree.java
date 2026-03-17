// Last updated: 17/03/2026, 12:25:33
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
17    public int maxLevelSum(TreeNode root) {
18        Queue<TreeNode> q=new LinkedList<>();
19        int level=1;
20        int ans =1;
21        int maxSum=Integer.MIN_VALUE;
22        q.add(root);
23        while(!q.isEmpty()){
24            int qSize=q.size();
25            int sum=0;
26            for(int i=0;i<qSize;i++){
27                TreeNode r=q.poll();
28                sum+=r.val;
29                if(r.left!=null){
30                    q.add(r.left);
31                }
32                if(r.right!=null){
33                    q.add(r.right);
34                }
35            }
36            if(maxSum<sum){
37                ans=level;
38                maxSum=sum;   
39            }
40            level++;
41        }
42        return ans;
43
44    }
45}