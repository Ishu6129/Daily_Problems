// Last updated: 27/01/2026, 15:23:10
1class Solution {
2    class Pair{
3        int vtx;
4        int cost;
5        Pair(int vtx,int cost){
6            this.vtx=vtx;
7            this.cost=cost;
8        }
9    }
10    public int minCost(int n, int[][] edges) {
11        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
12        for(int i=0;i<n;i++){
13            map.put(i,new HashMap<>());
14        }
15        for(int[] e:edges){
16            map.get(e[0]).put(e[1],
17                Math.min(map.get(e[0]).getOrDefault(e[1], Integer.MAX_VALUE), e[2]));
18            map.get(e[1]).put(e[0],
19                Math.min(map.get(e[1]).getOrDefault(e[0], Integer.MAX_VALUE), 2 * e[2]));
20
21        }
22        
23        int[] ans=new int[n];
24        Arrays.fill(ans,Integer.MAX_VALUE);
25        
26        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->a.cost-b.cost);
27        q.add(new Pair(0,0));
28        ans[0]=0;
29        
30        while(!q.isEmpty()){
31            Pair r=q.poll();
32            if (r.cost > ans[r.vtx]) continue;
33            for (Map.Entry<Integer, Integer> nbr : map.get(r.vtx).entrySet()) {
34                int nbrVtx = nbr.getKey();
35                int wt = nbr.getValue();
36                int newDist = r.cost + wt;
37                if (newDist < ans[nbrVtx]) {
38                    ans[nbrVtx] = newDist;
39                    q.add(new Pair(nbrVtx, newDist));
40                }
41            }
42        }
43        return ans[n-1]==Integer.MAX_VALUE?-1:ans[n-1];
44    }
45}