// Last updated: 8/5/2026, 5:38:58 PM
1class Solution {
2    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
3        Map<Integer,List<Integer>> map=new HashMap<>();
4        for(int i=0;i<n;i++){
5            map.put(i,new ArrayList<>());
6        }
7        for(int i[]:invocations){
8            int u=i[0];
9            int v=i[1];
10            map.get(u).add(v);
11        }
12        boolean vis[]=new boolean[n];
13        Stack<Integer> st=new Stack<>();
14        st.push(k);
15        while(!st.isEmpty()){
16            int r=st.pop();
17            if(vis[r]) continue;
18            vis[r]=true;
19            for(int nbr:map.get(r)){
20                if(!vis[nbr]) st.push(nbr);
21            }
22        }
23        for(int e[]:invocations){
24            int u=e[0];
25            int v=e[1];
26            if(!vis[u] && vis[v]){
27                List<Integer> ans=new ArrayList<>();
28                for(int i=0;i<n;i++){
29                    ans.add(i);
30                }
31                return ans;
32            }
33        }
34        List<Integer> ans=new ArrayList<>();
35        for(int i=0;i<n;i++){
36            if(!vis[i]) ans.add(i);
37        }
38        return ans;
39    }
40}