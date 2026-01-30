// Last updated: 30/01/2026, 12:31:02
1class Solution {
2    public int minimumMoves(String s) {
3        int ans=0;
4        for(int i=0;i<s.length();i++){
5            while(i<s.length() && s.charAt(i)=='O'){
6                i++;
7            }
8            if(i==s.length()) return ans;
9            ans++;
10            i+=2;
11        }
12        return ans;
13    }
14}