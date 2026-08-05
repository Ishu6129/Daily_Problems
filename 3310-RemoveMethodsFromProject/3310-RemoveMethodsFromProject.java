// Last updated: 8/5/2026, 5:29:32 PM
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
36                    for(int nbr:map.get(r)){
37                        if(!nset.contains(nbr)) st.push(nbr);
38                    }
39                }
40            }
41        }
42        List<Integer> ans=new ArrayList<>();
43        Set<Integer> cmn = new HashSet<>(set);
44        cmn.retainAll(nset);
45        if(!cmn.isEmpty()){
46            for(int i=0;i<n;i++){
47                ans.add(i);
48            }
49            return ans;
50        }
51        for(int i=0;i<n;i++){
52            if(vis[i]) ans.add(i);
53        }
54        return ans;
55    }
56}