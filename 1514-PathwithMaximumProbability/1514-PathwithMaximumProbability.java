// Last updated: 31/12/2025, 16:19:57
1class Solution {
2    class Pair{
3        int vtx;
4        double cost;
5        Pair(int vtx,double cost){
6            this.vtx=vtx;
7            this.cost=cost;
8        }
9    }
10    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
11        HashMap<Integer,HashMap<Integer,Double>> map=new HashMap<>();
12        for(int i=0;i<n;i++){
13            map.put(i,new HashMap<>());
14        }
15        for(int i=0;i<edges.length;i++){
16            map.get(edges[i][0]).put(edges[i][1],succProb[i]);
17            map.get(edges[i][1]).put(edges[i][0],succProb[i]);
18        }
19        double[] prob=new double[n];
20        Arrays.fill(prob,0.0);
21        PriorityQueue<Pair> q =new PriorityQueue<>((a, b) -> Double.compare(b.cost, a.cost));
22        q.add(new Pair(start_node,1.0));
23        prob[start_node]=1.0;
24        while(!q.isEmpty()){
25            Pair r=q.poll();
26            int rvtx=r.vtx;
27            double rcost=r.cost;
28            if (rvtx == end_node) return rcost;
29            for (Map.Entry<Integer, Double> nbr : map.get(r.vtx).entrySet()) {
30                int next=nbr.getKey();
31                double pr=nbr.getValue();
32                double newPr=pr*rcost;
33                if (newPr>prob[next]) {
34                    prob[next] = newPr;
35                    q.add(new Pair(next,newPr));
36                }
37            }
38        }
39        return 0.0;
40    }
41}