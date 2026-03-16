// Last updated: 16/03/2026, 17:36:23
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if(s.length()==0) return true;
4        if(s.length()>t.length()) return false;
5        int c=0;
6        int idx=0;
7        for(char i:t.toCharArray()){
8            if(idx<s.length() &&  s.charAt(idx)==i){
9                idx++;
10            }
11            if(idx==s.length()) return true;
12        }
13        return false;
14    }
15}