// Last updated: 6/20/2026, 9:07:13 PM
1class Solution {
2    Map<Integer,ArrayList<Integer>> map;
3    long[] mn;
4    long[] mx;
5    long[] ans;
6    int[] tm;
7    public long finishTime(int n, int[][] edges, int[] tm) {
8        map=new HashMap<>();
9        this.tm=tm;
10        mn=new long[n];
11        mx=new long[n];
12        ans=new long[n];
13        Arrays.fill(mn,-1);
14        Arrays.fill(mx,-1);
15        for(int i=0;i<n;i++){
16            map.put(i,new ArrayList<>());
17        }
18        for(int[] e:edges){
19            int u=e[0];
20            int v=e[1];
21            map.get(u).add(v);
22            map.get(v).add(u);
23        }
24        find(0,-1);
25        return ans[0];
26    }
27    public void find(int node,int parent){
28        boolean isLeaf=true;
29        long mnn=Long.MAX_VALUE;
30        long mxx=Long.MIN_VALUE;
31        for(int i: map.get(node)){
32            if(i==parent) continue;
33            isLeaf=false;
34            find(i,node);
35            mnn=Math.min(mnn,ans[i]);
36            mxx=Math.max(mxx,ans[i]);
37        }
38        if(isLeaf){
39            mn[node]=tm[node];
40            mx[node]=tm[node];
41            ans[node]=tm[node];
42            return;
43        }
44        mn[node]=mnn;
45        mx[node]=mxx;
46        ans[node]=((mx[node]-mn[node])+tm[node])+mx[node];
47        
48    }
49}