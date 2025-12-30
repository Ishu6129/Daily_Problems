// Last updated: 30/12/2025, 22:44:11
1class Solution {
2    public int closestMeetingNode(int[] edges, int node1, int node2) {
3        HashMap<Integer,List<Integer>> map=new HashMap<>();
4        for(int i=0;i<edges.length;i++){
5            map.put(i,new ArrayList<>());
6        }
7        for(int e=0;e<edges.length;e++){
8            if(edges[e]!=-1) map.get(e).add(edges[e]);
9        }
10        int[] fn1=new int[edges.length];
11        Arrays.fill(fn1,-1);
12        Queue<Integer> q=new LinkedList<>();
13        q.add(node1);
14        fn1[node1]=0;
15        while(!q.isEmpty()){
16            int r=q.poll();
17            for(int nbrs:map.get(r)){
18                if(fn1[nbrs]==-1){
19                    fn1[nbrs]=fn1[r]+1;
20                    q.add(nbrs);
21                }
22            }
23        }
24        int[] fn2=new int[edges.length];
25        Arrays.fill(fn2,-1);
26        q=new LinkedList<>();
27        q.add(node2);
28        fn2[node2]=0;
29        while(!q.isEmpty()){
30            int r=q.poll();
31            for(int nbrs:map.get(r)){
32                if(fn2[nbrs]==-1){
33                    fn2[nbrs]=fn2[r]+1;
34                    q.add(nbrs);
35                }
36            }
37        }
38        int ans=-1;
39        int best=Integer.MAX_VALUE;
40        for (int i=0;i<edges.length;i++) {
41            if (fn1[i]!= -1 && fn2[i]!= -1) {
42                int cur=Math.max(fn1[i],fn2[i]);
43                if (cur<best) {
44                    best=cur;
45                    ans=i;
46                }
47            }
48        }
49        return ans;
50    }
51}