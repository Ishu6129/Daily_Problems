// Last updated: 02/01/2026, 23:28:45
1class Solution {
2     class Pair{
3        int vtx;
4        int cost;
5        Pair(int vtx,int cost){
6            this.vtx=vtx;
7            this.cost=cost;
8        }
9    }
10    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
11        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
12        for(int i=0;i<n;i++){
13            map.put(i,new HashMap<>());
14        }
15        for(int[] e:edges){
16            map.get(e[0]).put(e[1],Math.min(map.get(e[0]).getOrDefault(e[1], Integer.MAX_VALUE), e[2]));
17            map.get(e[1]).put(e[0],Math.min(map.get(e[1]).getOrDefault(e[0], Integer.MAX_VALUE), e[2]));
18        }
19        int[] ans=new int[n];
20        Arrays.fill(ans,Integer.MAX_VALUE);
21        
22        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->a.cost-b.cost);
23        q.add(new Pair(0,0));
24        ans[0]=0;
25        int time=0;
26        while(!q.isEmpty()){
27            Pair r=q.poll();
28            int vtx=r.vtx;
29            int cost=r.cost;
30            if (cost > ans[vtx]) continue;
31            if (cost >= disappear[vtx]) continue;
32            for (Map.Entry<Integer, Integer> nbr : map.get(vtx).entrySet()) {
33                int nbrVtx = nbr.getKey();
34                int wt = nbr.getValue();
35                int newTime = cost + wt;
36                if (newTime < ans[nbrVtx] && newTime < disappear[nbrVtx]) {
37                    ans[nbrVtx] = newTime;
38                    q.add(new Pair(nbrVtx, newTime));
39                }
40            }
41        }
42        for (int i=0;i<n;i++) {
43            if (ans[i]==Integer.MAX_VALUE) {
44                ans[i]=-1;
45            }
46        }
47        return ans;
48    }
49}