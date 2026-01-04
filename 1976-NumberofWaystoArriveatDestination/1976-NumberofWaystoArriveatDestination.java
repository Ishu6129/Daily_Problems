// Last updated: 04/01/2026, 22:31:24
1class Solution {
2    class Pair{
3        int vtx;
4        long tm;
5        Pair(int vtx,long tm){
6            this.vtx=vtx;
7            this.tm=tm;
8        }
9    }
10    public int countPaths(int n, int[][] roads) {
11        int mod = 1_000_000_007;
12        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
13        for(int i=0;i<n;i++){
14            map.put(i,new HashMap<>());
15        }
16        for(int[] i:roads){
17            map.get(i[0]).put(i[1],i[2]);
18            map.get(i[1]).put(i[0],i[2]);
19        }
20        long[] time=new long[n];
21        Arrays.fill(time,Long.MAX_VALUE);
22        long[] ways=new long[n];
23        ways[0]=1;
24        PriorityQueue<Pair> pq =new PriorityQueue<>((a,b)->Long.compare(a.tm, b.tm));
25        pq.add(new Pair(0,0));
26        time[0]=0;
27        while(!pq.isEmpty()){
28            Pair r=pq.poll();
29            if(r.tm > time[r.vtx]) continue;
30            for(Map.Entry<Integer, Integer> nbr : map.get(r.vtx).entrySet()){
31                int nbrVtx = nbr.getKey();
32                long tm = nbr.getValue();
33                long newTime = r.tm + tm;
34                if(newTime<time[nbrVtx]){
35                    time[nbrVtx]=newTime;
36                    ways[nbrVtx]=ways[r.vtx];
37                    pq.add(new Pair(nbrVtx,newTime));
38                }
39                else if(newTime==time[nbrVtx]){
40                    ways[nbrVtx]=(ways[r.vtx]+ways[nbrVtx])%mod;
41                }
42            }
43        }
44        return (int)(ways[n-1]%mod);
45    }
46}