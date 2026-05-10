// Last updated: 5/10/2026, 8:49:50 AM
1class Solution {
2    public int[] countWordOccurrences(String[] chunks, String[] queries) {
3        Map<String,Integer> map=new HashMap<>();
4        StringBuilder sb=new StringBuilder("");
5        for(String s:chunks) sb.append(s);
6        String[] sp_arr=sb.toString().split("\\s+|(?<![a-zA-Z])-|-(?![a-zA-Z])|-{2,}+");
7        for(String s:sp_arr){
8            map.putIfAbsent(s,0);
9            map.put(s,map.get(s)+1);
10        }
11        int[] ans=new int[queries.length];
12        for(int i=0;i<queries.length;i++){
13            ans[i]=map.getOrDefault(queries[i],0);
14        }
15        return ans;
16    }
17}