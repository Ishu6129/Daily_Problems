// Last updated: 7/4/2026, 5:05:20 PM
1class Solution {
2    public int minScore(int n, int[][] roads) {
3        Map<Integer,List<int[]>> map=new HashMap<>();
4        for(int i=1;i<=n;i++) map.put(i,new ArrayList<>());
5        for(int[] e:roads){
6            int u=e[0];
7            int v=e[1];
8            int w=e[2];
9            map.get(u).add(new int[]{v,w});
10            map.get(v).add(new int[]{u,w});
11        }
12        Queue<Integer> q=new LinkedList<>();
13        Set<Integer> set =new HashSet<>();
14        q.add(1);
15        int ans=Integer.MAX_VALUE;
16        while(!q.isEmpty()){
17            int r=q.poll();
18            set.add(r);
19            List<int[]> nbrs=map.get(r);
20            for(int[] nbr:nbrs){
21                ans=Math.min(ans,nbr[1]);
22                if(!set.contains(nbr[0])){
23                    q.add(nbr[0]);
24                }
25            }
26        }
27        return ans;
28    }
29}