// Last updated: 8/5/2026, 5:32:43 PM
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
13        Arrays.fill(vis,true);
14        Stack<Integer> st=new Stack<>();
15        st.push(k);
16        Set<Integer> set=new HashSet<>();
17        while(!st.isEmpty()){
18            int r=st.pop();
19            if(set.contains(r)) continue;
20            set.add(r);
21            vis[r]=false;
22            for(int nbr:map.get(r)){
23                if(!set.contains(nbr)) st.push(nbr);
24            }
25        }
26        Set<Integer> nset=new HashSet<>();
27        for(int i:map.keySet()){
28            if(!set.contains(i)){
29                st=new Stack<>();
30                st.push(i);
31                while(!st.isEmpty()){
32                    int r=st.pop();
33                    if(nset.contains(r)) continue;
34                    nset.add(r);
35                    vis[r]=true;
36                    if(set.contains(r)){
37                        List<Integer> ans=new ArrayList<>();
38                        for(int v=0;v<n;v++){
39                            ans.add(v);
40                        }
41                        return ans;
42                    }
43                    for(int nbr:map.get(r)){
44                        if(!nset.contains(nbr)) st.push(nbr);
45                    }
46                }
47            }
48        }
49        List<Integer> ans=new ArrayList<>();
50        for(int i=0;i<n;i++){
51            if(vis[i]) ans.add(i);
52        }
53        return ans;
54    }
55}