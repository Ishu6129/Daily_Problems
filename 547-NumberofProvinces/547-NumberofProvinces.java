// Last updated: 30/12/2025, 21:47:27
1class Solution {
2    private HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
3    public int findCircleNum(int[][] isConnected) {
4        int ans=0;
5        for(int i=0;i<isConnected.length;i++){
6            map.put(i,new ArrayList<>());
7        }
8        for(int i=0;i<isConnected.length;i++){
9            for(int j=0;j<isConnected[0].length;j++){
10                if(i!=j && isConnected[i][j]==1){
11                    map.get(i).add(j);
12                }
13            }
14        }
15        Set<Integer> set=new HashSet<>();
16        for(int i=0;i<isConnected.length;i++){
17            if(set.contains(i)) continue;
18            bfs(isConnected,i,set);
19            ans++;
20        }
21        return ans;
22    }
23    public void bfs(int[][] grid,int i,Set<Integer> set){
24        Queue<Integer> q=new LinkedList<>();
25        q.add(i);
26        set.add(i);
27        while(!q.isEmpty()){
28            int r=q.poll();
29            for(int nbrs:map.get(r)){
30                if(!set.contains(nbrs)){
31                    q.add(nbrs);
32                    set.add(nbrs);
33                }
34            }
35        }
36
37    }
38}