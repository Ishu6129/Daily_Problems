// Last updated: 22/02/2026, 15:53:59
1class Solution {
2    public int binaryGap(int n) {
3        while(n>0){
4            if((n&1)==1) break;
5            n=n>>1;
6        }
7        if(n<=0) return 0;
8        int ans=0;
9        int dis=0;
10        while(n>0){
11            if((n&1)==1){
12                ans=Math.max(ans,dis);
13                dis=0;
14            }
15            dis++;
16            n=n>>1;
17        } 
18        return ans;
19    }
20}