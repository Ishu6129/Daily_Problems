// Last updated: 11/02/2026, 12:32:50
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
36        StringBuilder sb=new StringBuilder();
37        for(int i=31;i>=0;i--){
38            int bit=val&(1<<i);
39            if(bit==0){
40                if(curr.one!=null){
41                    sb.append('1');
42                    curr=curr.one;
43                }
44                else{
45                    sb.append('0');
46                    curr=curr.zero;
47                }
48            }
49            else{
50                if(curr.zero!=null){
51                    sb.append('1');
52                    curr=curr.zero;
53                }
54                else{
55                    sb.append('0');
56                    curr=curr.one;
57                }
58            }
59        }
60        return Integer.parseInt(sb.toString(),2);
61    }
62
63    public int findMaximumXOR(int[] nums) {
64        for(int i:nums){
65            add(i);
66        }
67        int ans=0;
68        for(int i:nums){
69            ans=Math.max(ans,find(i));
70        }
71        return ans;
72    }
73}