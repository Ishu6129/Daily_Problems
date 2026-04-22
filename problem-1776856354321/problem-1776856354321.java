// Last updated: 4/22/2026, 4:42:34 PM
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
25    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
26        int n=s.length();
27        rank=new int[n];
28        parent=new int[n];
29        for(int i=0;i<n;i++){
30            parent[i]=i;
31        }
32        for(List<Integer> ls:pairs){
33            union(ls.get(0),ls.get(1));
34        }
35        Map<Integer,PriorityQueue<Character>> map=new HashMap<>();
36        for(int i=0;i<n;i++){
37            int p=findParent(i);
38            map.putIfAbsent(p,new PriorityQueue<>());
39            PriorityQueue<Character> pq=map.get(p);
40            pq.add(s.charAt(i));
41        }
42        StringBuilder sb=new StringBuilder();
43        for(int i=0;i<n;i++){
44            int p=findParent(i);
45            PriorityQueue<Character> pq=map.get(p);
46            sb.append(pq.poll());
47            
48        }
49        return sb.toString();
50    }
51}