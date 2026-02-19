// Last updated: 19/02/2026, 21:22:07
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int pre=1;
4        int ans=0;
5        for(int i=1;i<s.length();i++){
6            if(s.charAt(i)==s.charAt(i-1)) pre++;
7            else{
8                int curr=1;
9                while((i+1)<s.length() && s.charAt(i)==s.charAt(i+1)){
10                    i++;
11                    curr++;
12                }
13                ans+=Math.min(pre,curr);
14                pre=curr;
15            }
16        }
17        return ans;
18    }
19}