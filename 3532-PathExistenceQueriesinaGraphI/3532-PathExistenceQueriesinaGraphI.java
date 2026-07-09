// Last updated: 7/9/2026, 7:27:02 PM
1class Solution {
2    class Node{
3        int val;
4        int rank;
5        Node parent;
6    }
7    public HashMap<Integer,Node> map=new HashMap<>();
8    public void create(int v){
9        Node nn=new Node();
10        nn.rank=0;
11        nn.parent=nn;
12        map.put(v,nn);
13    }
14    public int find(int v){
15        Node node=map.get(v);
16        return find(node).val;
17    }
18    public Node find(Node node){
19        if(node.parent==node){
20            return node;
21        }
22        Node n=find(node.parent);
23        node.parent=n;
24        return n;
25    }
26    public void union(int v1,int v2){
27        Node node1=map.get(v1);
28        Node node2=map.get(v2);
29        Node re1=find(node1);
30        Node re2=find(node2);
31        if(re1.rank==re2.rank){
32            re1.parent=re2;
33            re2.rank++;
34        }
35        else if(re1.rank<re2.rank){
36            re1.parent=re2;
37        }
38        else{
39            re2.parent=re1;   
40        }
41    }
42    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
43        boolean[] ans=new boolean[queries.length];
44        for(int i=0;i<n;i++) create(i);
45        for(int i=1;i<n;i++){
46            if(nums[i]-nums[i-1]<=maxDiff){
47                union(i,i-1);
48            }
49        }
50        for(int i=0;i<queries.length;i++){
51            Node re1=map.get(queries[i][0]);
52            Node re2=map.get(queries[i][1]);
53            if(re1.parent==re2.parent) ans[i]=true;
54        }
55        return ans;
56    }
57}