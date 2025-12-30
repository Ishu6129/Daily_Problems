// Last updated: 30/12/2025, 12:26:57
1class Solution {
2    class Pair{
3        int vtx;
4        int cost;
5        int step;
6        Pair(int vtx,int cost,int step){
7            this.vtx=vtx;
8            this.cost=cost;
9            this.step=step;
10        }
11    }
12    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
13        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
14        for(int i=0;i<n;i++){
15            map.put(i,new HashMap<>());
16        }
17        for(int[] e:flights){
18            map.get(e[0]).put(e[1],e[2]);
19        }
20        int[][] dist=new int[n][k+2];
21        for(int[] i:dist){
22            Arrays.fill(i,Integer.MAX_VALUE);
23        }
24        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->a.cost-b.cost);
25        q.add(new Pair(src,0,0));
26        dist[src][0]=0;
27        while(!q.isEmpty()){
28            Pair r=q.poll();
29            int rvtx=r.vtx;
30            int rcost=r.cost;
31            int rstep=r.step;
32            if (rvtx == dst) return rcost;
33            if (rstep > k) continue;
34            for (Map.Entry<Integer, Integer> nbr : map.get(r.vtx).entrySet()) {
35                int next=nbr.getKey();
36                int wt=nbr.getValue();
37                int newCost=r.cost + wt;
38                if (newCost<dist[next][r.step+1]) {
39                    dist[next][r.step+1] = newCost;
40                    q.add(new Pair(next,newCost,r.step+1));
41                }
42            }
43        }
44        return -1;
45    }
46}