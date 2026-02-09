// Last updated: 09/02/2026, 12:04:41
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
17    class Node{
18        TreeNode n;
19        int level;
20        Node(TreeNode n,int level){
21            this.n=n;
22            this.level=level;
23        }
24    }
25    public TreeNode reverseOddLevels(TreeNode root) {
26        traverse(root);    
27        return root;
28    }
29    public void traverse(TreeNode root){
30        if(root==null) return;
31        Queue<Node> q=new LinkedList<>();
32        Stack<TreeNode> st=new Stack<>();
33        ArrayList<Integer> list=new ArrayList<>();
34        q.add(new Node(root,0));
35        while(!q.isEmpty()){
36            Node r=q.poll();
37            boolean flag=false;
38            if(r.level%2==0){
39                flag=true;
40            }
41            if(r.n.left!=null){
42                q.add(new Node(r.n.left,r.level+1));
43                if(flag){
44                    st.push(r.n.left);
45                    list.add(r.n.left.val);
46                }
47            }
48            if(r.n.right!=null){
49                q.add(new Node(r.n.right,r.level+1));
50                if(flag){
51                    st.push(r.n.right);
52                    list.add(r.n.right.val);
53                }
54            }
55            if(r.level%2!=0){
56                int idx=0;
57                while(!st.isEmpty()){
58                    st.pop().val=list.get(idx++);
59                }
60                st.clear();
61                list.clear();
62            }
63        }
64    }
65
66}