// Last updated: 7/21/2026, 1:18:16 PM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        int n=s.length();
4        int maxz=0;
5        int pre=0;
6        int ans=0;
7        int i=0;
8        while(i<n){
9            if(s.charAt(i)=='1'){
10                ans++;
11                i++;
12            }
13            else{
14                int z=0;
15                while(i<n && s.charAt(i)=='0'){
16                    z++;
17                    i++;
18                }
19                if(pre>0){
20                    maxz=Math.max(maxz,z+pre);
21                }
22                pre=z;
23            }
24        }
25        return ans+maxz;
26    }
27}