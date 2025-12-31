// Last updated: 31/12/2025, 15:56:29
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        HashMap<Integer,List<Integer>> map=new HashMap<>();
4        for(int i=0;i<n;i++){
5            map.put(i,new ArrayList<>());
6        }
7        for(int[] e:edges){
8            map.get(e[0]).add(e[1]);
9            map.get(e[1]).add(e[0]);
10        }
11        int[] ans=new int[n];
12        Arrays.fill(ans,-1);
13        Queue<Integer> q=new LinkedList<>();
14        q.add(source);
15        ans[source]=0;
16        while(!q.isEmpty()){
17            int r=q.poll();
18            for(int nbrs:map.get(r)){
19                if(ans[nbrs]==-1){
20                    ans[nbrs]=ans[r]+1;
21                    q.add(nbrs);
22                }
23            }
24        }
25        return (ans[destination]==-1)? false:true;
26    }
27}