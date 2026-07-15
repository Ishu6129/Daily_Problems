// Last updated: 7/15/2026, 6:05:44 PM
1import java.util.*;
2class Solution {
3    public List<Integer> eventualSafeNodes(int[][] graph) {
4        int n=graph.length;
5        Set<Integer> s1=new HashSet<>();
6        Set<Integer> s2=new HashSet<>();
7        for (int i=0;i<n;i++) {
8            dfs(i,graph,s1,s2);
9        }
10        List<Integer> ans=new ArrayList<>(s2);
11        Collections.sort(ans);
12        return ans;
13    }
14    private boolean dfs(int i,int[][] graph,Set<Integer> s1,Set<Integer>s2) {
15        if(s2.contains(i)) return true;
16        if(s1.contains(i)) return false;
17        s1.add(i);
18        for (int j:graph[i]) {
19            if (!dfs(j,graph,s1,s2)) {
20                return false;
21            }
22        }
23        s1.remove(i);
24        System.out.println(i);
25        s2.add(i);
26        return true;
27    }
28}