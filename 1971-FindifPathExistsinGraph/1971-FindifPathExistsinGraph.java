// Last updated: 31/12/2025, 16:01:21
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        if(source==destination) return true;
4        HashMap<Integer,List<Integer>> map=new HashMap<>();
5        for(int i=0;i<n;i++){
6            map.put(i,new ArrayList<>());
7        }
8        for(int[] e:edges){
9            map.get(e[0]).add(e[1]);
10            map.get(e[1]).add(e[0]);
11        }
12        Set<Integer> set=new HashSet<>();
13        Queue<Integer> q=new LinkedList<>();
14        q.add(source);
15        while(!q.isEmpty()){
16            int r=q.poll();
17            for(int nbrs:map.get(r)){
18                if(!set.contains(nbrs)){
19                    if(nbrs==destination) return true;
20                    set.add(nbrs);
21                    q.add(nbrs);
22                }
23            }
24        }
25        return false;
26    }
27}