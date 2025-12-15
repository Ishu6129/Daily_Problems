// Last updated: 15/12/2025, 18:40:37
1class Solution {
2    public long getDescentPeriods(int[] prices) {
3        long ans=0;
4        long c=1;
5        for(int i=1;i<prices.length;i++){
6            if(prices[i-1]-prices[i]==1){
7                c++;
8            }
9            else{
10                ans+=(c*(c+1))/2;
11                c=1;
12            }
13        }
14        ans+=(c*(c+1))/2;
15        return ans;
16    }
17}