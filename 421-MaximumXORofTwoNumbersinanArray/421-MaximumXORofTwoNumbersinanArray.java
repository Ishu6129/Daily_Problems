// Last updated: 11/02/2026, 12:34:39
1class Solution {
2    class Node{
3        Node zero;
4        Node one;
5    }
6    private Node root=new Node();
7    public void add(int val){
8        Node curr=root;
9        for(int i=31;i>=0;i--){
10            int bit=val&(1<<i);
11            if(bit==0){
12                if(curr.zero!=null){
13                    curr=curr.zero;
14                }
15                else{
16                    Node nn=new Node();
17                    curr.zero=nn;
18                    curr=nn;
19                }
20            }
21            else{
22                if(curr.one!=null){
23                    curr=curr.one;
24                }
25                else{
26                    Node nn=new Node();
27                    curr.one=nn;
28                    curr=nn;
29                }
30            }
31        }
32
33    }
34    public int find(int val){
35        Node curr=root;
36        int ans=0;
37        for(int i=31;i>=0;i--){
38            int bit=val&(1<<i);
39            if(bit==0){
40                if(curr.one!=null){
41                    ans=ans|(1<<i);
42                    curr=curr.one;
43                }
44                else{
45                    curr=curr.zero;
46                }
47            }
48            else{
49                if(curr.zero!=null){
50                    ans=ans|(1<<i);
51                    curr=curr.zero;
52                }
53                else{
54                    curr=curr.one;
55                }
56            }
57        }
58        return ans;
59    }
60
61    public int findMaximumXOR(int[] nums) {
62        for(int i:nums){
63            add(i);
64        }
65        int ans=0;
66        for(int i:nums){
67            ans=Math.max(ans,find(i));
68        }
69        return ans;
70    }
71}