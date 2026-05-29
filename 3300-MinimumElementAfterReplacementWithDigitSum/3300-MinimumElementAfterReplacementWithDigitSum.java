// Last updated: 5/29/2026, 12:11:37 PM
1class Solution {
2    public int minElement(int[] nums) {
3       int ans=Integer.MAX_VALUE;
4       for(int i:nums){
5        ans=Math.min(ans,sum(i));
6       } 
7       return ans;
8    }
9    public int sum(int num){
10        int t=num;
11        int ans=0;
12        while(t>0){
13            ans+=t%10;
14            t/=10;
15        }
16        return ans;
17    }
18}
19