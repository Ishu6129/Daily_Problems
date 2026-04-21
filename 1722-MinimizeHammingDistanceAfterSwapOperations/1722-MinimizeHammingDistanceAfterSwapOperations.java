// Last updated: 22/04/2026, 00:08:19
1class Solution {
2    int[] rank;
3    int[] parent;
4    int findParent(int node){
5        if(node==parent[node]){
6            return node;
7        }
8        return parent[node]=findParent(parent[node]);
9    }
10    void union(int u,int v){
11        int p_u=findParent(u);
12        int p_v=findParent(v);
13        if(p_u==p_v) return;
14        if(rank[p_u]==rank[p_v]){
15            parent[p_v]=p_u;
16            rank[p_u]++;
17        }
18        else if(rank[p_u]<rank[p_v]){
19            parent[p_u]=p_v;
20        }
21        else{
22            parent[p_v]=p_u;
23        }
24    }
25    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
26        int n=source.length;
27        rank=new int[n];
28        parent=new int[n];
29        for(int i=0;i<n;i++){
30            parent[i]=i;
31        }
32        for(int[] i:allowedSwaps){
33            union(i[0],i[1]);
34        }
35        Map<Integer,Map<Integer,Integer>> map = new HashMap<>();
36        for(int i=0;i<n;i++){
37            int p = findParent(i);
38            map.putIfAbsent(p, new HashMap<>());
39            Map<Integer,Integer> freq = map.get(p);
40            freq.put(source[i], freq.getOrDefault(source[i], 0) + 1);
41        }
42        int ans=0;
43        for(int i = 0; i<n;i++){
44            int p=findParent(i);
45            Map<Integer,Integer> freq = map.get(p);
46            if(freq.getOrDefault(target[i],0) > 0){
47                freq.put(target[i],freq.get(target[i])-1);
48            } 
49            else {
50                ans++;
51            }
52        }
53        return ans;
54
55    }
56}