// Last updated: 6/13/2026, 11:58:27 AM
1class Solution {
2    public String mapWordWeights(String[] wr, int[] wi) {
3        StringBuilder ans=new StringBuilder();
4        for(String s:wr){
5            int sm=0;
6            for(char ch:s.toCharArray()){
7                sm+=wi[ch-'a'];
8            }
9            ans.append((char)(122-sm%26));
10        }
11        return ans.toString();
12    }
13}