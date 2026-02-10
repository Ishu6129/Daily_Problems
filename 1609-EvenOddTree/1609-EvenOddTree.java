// Last updated: 10/02/2026, 12:20:01
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
25    boolean ans=true;
26    public boolean isEvenOddTree(TreeNode root) {
27        traverse(root);
28        return ans;
29    }
30    public void traverse(TreeNode root){
31        if(root==null) return;
32        Queue<Node> q=new LinkedList<>();
33        ArrayList<Integer> list1=new ArrayList<>();
34        ArrayList<Integer> list2=new ArrayList<>();
35        q.add(new Node(root,0));
36        list2.add(root.val);
37        while(!q.isEmpty()){
38            Node r=q.poll();
39            boolean flag1=false;
40            boolean flag2=false;
41            if(r.level%2==0){
42                flag1=true;
43            }
44            else{
45                flag2=true;
46            }
47            if(r.n.left!=null){
48                q.add(new Node(r.n.left,r.level+1));
49                if(flag1){
50                    list1.add(r.n.left.val);
51                }
52                else{
53                    list2.add(r.n.left.val);
54                }
55                
56            }
57            if(r.n.right!=null){
58                q.add(new Node(r.n.right,r.level+1));
59                if(flag1){
60                    list1.add(r.n.right.val);
61                }
62                else{
63                    list2.add(r.n.right.val);
64                }
65            }
66            if(r.level%2!=0 && list1.size()!=0){
67                if(list1.get(0)%2!=0){
68                    ans=false;
69                    return;
70                }
71                for(int i=1;i<list1.size();i++){
72                    if(list1.get(i-1)<=list1.get(i) || list1.get(i)%2!=0){
73                        ans=false;
74                        System.out.println(false);
75                        return;
76                    }
77                }
78                list1.clear();
79            }
80            else if(r.level%2==0 && list2.size()!=0){
81                if(list2.get(0)%2==0){
82                    ans=false;
83                    return;
84                }
85                for(int i=1;i<list2.size();i++){
86                    if(list2.get(i-1)>=list2.get(i) || list2.get(i)%2==0 ){
87                        ans=false;
88                        System.out.println(false);
89                        return;
90                    }
91                }
92                list2.clear();
93            }
94        }
95    }
96}