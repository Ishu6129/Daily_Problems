// Last updated: 03/01/2026, 11:22:22
1class Solution {
2    class bipart{
3        int vtx;
4        int level;
5        bipart(int vtx,int level){
6            this.vtx=vtx;
7            this.level=level;
8        }
9    }
10    public boolean possibleBipartition(int n, int[][] dislikes) {
11        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
12        for(int i=1;i<=n;i++){
13            map.put(i,new ArrayList<>());
14        }
15        for(int i=0;i<dislikes.length;i++){
16            map.get(dislikes[i][0]).add(dislikes[i][1]);
17            map.get(dislikes[i][1]).add(dislikes[i][0]);
18        }
19        Queue<bipart> q=new LinkedList<>();
20        HashMap<Integer,Integer> vis=new HashMap<>();
21        for (int i = 1; i <= n; i++) {
22            if (!vis.containsKey(i)) {
23                q.add(new bipart(i,0));
24                while(!q.isEmpty()){
25                    bipart r=q.poll();
26                    int vtx=r.vtx;
27                    int level=r.level;
28                    if(vis.containsKey(vtx) && vis.get(vtx)!=level){
29                        return false;
30                    }
31                    vis.put(vtx, level);
32                    for(int nbrs:map.get(vtx)){
33                        if(!vis.containsKey(nbrs)){
34                            q.add(new bipart(nbrs,level+1));
35                        }
36                    }
37                }
38            }
39        }
40        return true;
41    }
42}