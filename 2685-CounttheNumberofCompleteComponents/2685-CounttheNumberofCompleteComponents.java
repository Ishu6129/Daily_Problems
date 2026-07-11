// Last updated: 7/11/2026, 2:57:17 PM
1class Solution {
2    public int countCompleteComponents(int n, int[][] edges) {
3        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
4        for(int i=0;i<n;i++){
5            map.put(i,new ArrayList<>());
6        }
7        for(int[] e:edges){
8            int u=e[0];
9            int v=e[1];
10            map.get(u).add(v);
11            map.get(v).add(u);
12        }
13        int ans=0;
14        Set<Integer> vis=new HashSet<>();
15        Queue<Integer> q=new LinkedList<>();
16        for(int i=0;i<n;i++){
17            if(vis.contains(i)) continue;
18            q.add(i);
19            List<Integer> ls=new ArrayList<>();
20            while(!q.isEmpty()){
21                int r=q.poll();
22                if(vis.contains(r)) continue;
23                ls.add(r);
24                vis.add(r);
25                for(int nbrs:map.get(r)){
26                    if(!vis.contains(nbrs)){ 
27                        q.add(nbrs);
28                    }
29                }
30            }
31            int sz=ls.size()-1;
32            boolean check=true;
33            for(int l=0;l<ls.size();l++){
34                if(map.get(ls.get(l)).size()!=sz){
35                    check=false;
36                    break;
37                }
38            }
39            if(check) ans++;
40        }
41        return ans;
42    }
43}