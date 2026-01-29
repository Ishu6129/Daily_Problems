// Last updated: 29/01/2026, 23:26:03
1class Solution {
2    class Pair{
3        int vtx;
4        int cost;
5        Pair(int vtx,int cost){
6            this.vtx=vtx;
7            this.cost=cost;
8        }
9    }
10    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
11        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
12        for(int i=0;i<26;i++){
13            map.put(i,new HashMap<>());
14        }
15        for(int i=0;i<original.length;i++){
16            map.get(original[i]-'a').put(changed[i]-'a',
17            Math.min(
18                map.get(original[i]-'a').getOrDefault(changed[i]-'a',
19                    Integer.MAX_VALUE
20                ),
21                cost[i]
22            ));
23        }
24        HashMap<Integer,int[]> dis=new HashMap<>();
25        for(int i=0;i<26;i++){
26            dis.put(i,find(i,map));
27        }
28        long ans=0;
29        for(int i=0;i<source.length();i++){
30            int s=source.charAt(i)-'a';
31            int t=target.charAt(i)-'a';
32            int sp=dis.get(s)[t];
33            if(sp==Integer.MAX_VALUE) return -1;
34            ans+=sp;
35        }
36        return ans;
37    }
38    public int[] find(int src,HashMap<Integer,HashMap<Integer,Integer>> map){
39        int[] ans=new int[map.size()];
40        Arrays.fill(ans,Integer.MAX_VALUE);
41        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->a.cost-b.cost);
42        q.add(new Pair(src,0));
43        ans[src]=0;
44        while(!q.isEmpty()){
45            Pair r=q.poll();
46            if (r.cost > ans[r.vtx]) continue;
47            for (Map.Entry<Integer, Integer> nbr : map.get(r.vtx).entrySet()) {
48                int nbrVtx = nbr.getKey();
49                int wt = nbr.getValue();
50                int newDist = r.cost + wt;
51                if (newDist < ans[nbrVtx]) {
52                    ans[nbrVtx] = newDist;
53                    q.add(new Pair(nbrVtx, newDist));
54                }
55            }
56        }
57        return ans;
58    }
59}