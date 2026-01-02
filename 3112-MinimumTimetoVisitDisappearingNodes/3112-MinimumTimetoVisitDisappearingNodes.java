// Last updated: 02/01/2026, 23:30:13
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
21        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->a.cost-b.cost);
22        q.add(new Pair(0,0));
23        ans[0]=0;
24        while(!q.isEmpty()){
25            Pair r=q.poll();
26            int vtx=r.vtx;
27            int cost=r.cost;
28            if (cost > ans[vtx]) continue;
29            if (cost >= disappear[vtx]) continue;
30            for (Map.Entry<Integer, Integer> nbr : map.get(vtx).entrySet()) {
31                int nbrVtx = nbr.getKey();
32                int wt = nbr.getValue();
33                int newTime = cost + wt;
34                if (newTime < ans[nbrVtx] && newTime < disappear[nbrVtx]) {
35                    ans[nbrVtx] = newTime;
36                    q.add(new Pair(nbrVtx, newTime));
37                }
38            }
39        }
40        for (int i=0;i<n;i++) {
41            if (ans[i]==Integer.MAX_VALUE) {
42                ans[i]=-1;
43            }
44        }
45        return ans;
46    }
47}