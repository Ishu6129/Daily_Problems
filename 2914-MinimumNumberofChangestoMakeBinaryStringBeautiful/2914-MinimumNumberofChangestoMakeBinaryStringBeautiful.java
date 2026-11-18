// Last updated: 11/18/2026, 12:51:39 PM
1class Solution {
2    public int minChanges(String s) {
3        int ans=0;
4        int n=s.length();
5        for(int i=0;i<n;i+=2){
6            if(s.charAt(i)!=s.charAt(i+1)) ans++;
7        }
8        return ans;
9    }
10}