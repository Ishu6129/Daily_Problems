// Last updated: 8/5/2026, 5:47:47 PM
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
12        Stack<Integer> st=new Stack<>();
13        st.push(k);
14        Set<Integer> set=new HashSet<>();
15        while(!st.isEmpty()){
16            int r=st.pop();
17            if(set.contains(r)) continue;
18            set.add(r);
19            for(int nbr:map.get(r)){
20                if(!set.contains(nbr)) st.push(nbr);
21            }
22        }
23        Set<Integer> nset=new HashSet<>();
24        for(int i:map.keySet()){
25            if(!set.contains(i)){
26                st=new Stack<>();
27                st.push(i);
28                while(!st.isEmpty()){
29                    int r=st.pop();
30                    if(nset.contains(r)) continue;
31                    nset.add(r);
32                    if(set.contains(r)){
33                        List<Integer> ans=new ArrayList<>();
34                        for(int v=0;v<n;v++){
35                            ans.add(v);
36                        }
37                        return ans;
38                    }
39                    for(int nbr:map.get(r)){
40                        if(!nset.contains(nbr)) st.push(nbr);
41                    }
42                }
43            }
44        }
45        List<Integer> ans=new ArrayList<>();
46        for(int i=0;i<n;i++){
47            if(nset.contains(i)) ans.add(i);
48        }
49        return ans;
50    }
51}