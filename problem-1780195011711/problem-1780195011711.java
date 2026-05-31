// Last updated: 5/31/2026, 8:06:51 AM
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int[] freq=new int[10];
4        int t=n;
5        while(t>0){
6            freq[t%10]++;
7            t/=10;
8        }
9        int ans=0;
10        for(int i=0;i<10;i++){
11            ans+=freq[i]*i;
12        }
13        return ans;
14        
15    }
16}