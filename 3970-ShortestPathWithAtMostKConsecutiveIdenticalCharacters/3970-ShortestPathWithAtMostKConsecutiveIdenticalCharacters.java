// Last updated: 10/30/2026, 5:52:01 PM
1class Node{
2    int ch;
3    int vtx;
4    int w;
5    int k;
6    Node(int ch,int vtx,int w,int k){
7        this.ch=ch;
8        this.vtx=vtx;
9        this.w=w;
10        this.k=k;
11    }
12}
13class Solution {
14    public int shortestPath(int n, int[][] edges, String labels, int k) {
15        Map<Integer,ArrayList<int[]>> map=new HashMap<>();
16        for(int i[] : edges){
17            int u=i[0];
18            int v=i[1];
19            int w=i[2];
20            map.putIfAbsent(u,new ArrayList<>());
21            map.get(u).add(new int[]{v,w,labels.charAt(v)-'a'});
22        }
23        int[][] dist=new int[n][k+1];
24        for (int[] d:dist) {
25            Arrays.fill(d, Integer.MAX_VALUE);
26        }
27        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->Integer.compare(a.w,b.w));
28        int st=labels.charAt(0)-'a';
29        pq.add(new Node(st,0,0,1));
30        dist[0][1]=0;
31        while(!pq.isEmpty()){
32            Node curr=pq.poll();
33            int ch=curr.ch;
34            int wt=curr.w;
35            int currK=curr.k;
36            int vtx=curr.vtx;
37            if (wt != dist[vtx][currK]) continue;
38            if (vtx== n-1) return wt;
39            for(int[] nbr:map.getOrDefault(vtx, new ArrayList<>())){
40                int nbrVtx=nbr[0];
41                int nbrW=nbr[1];
42                int nbrCh=nbr[2];
43                int newWt=wt+nbrW;
44                int newK;
45                if(ch==nbrCh){
46                    if(currK>=k) continue;
47                    newK=currK+1;
48                }
49                else newK=1;
50                if (newWt<dist[nbrVtx][newK]){
51                    dist[nbrVtx][newK]=newWt;
52                    pq.add(new Node(nbrCh,nbrVtx,newWt,newK));
53                }
54            }
55        }
56        return -1;
57    }
58}