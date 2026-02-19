// Last updated: 19/02/2026, 21:26:03
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int pre=1;
4        int ans=0;
5        int curr=0;
6        for(int i=1;i<s.length();i++){
7            if(s.charAt(i)==s.charAt(i-1)) pre++;
8            else{
9                ans+=Math.min(pre,curr);
10                curr=pre;
11                pre=1;
12            }
13        }
14        return ans+Math.min(curr,pre);
15    }
16}