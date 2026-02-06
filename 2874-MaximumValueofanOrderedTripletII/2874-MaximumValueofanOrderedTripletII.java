// Last updated: 06/02/2026, 18:46:17
1class Solution {
2    public long maximumTripletValue(int[] nums) {
3        int n=nums.length;
4        int lmx[] =new int[n];
5        lmx[0]=nums[0];
6        for(int i=1;i<n;i++){
7            lmx[i]=Math.max(lmx[i-1],nums[i]);
8        }
9        int rmx[]=new int[n];
10        rmx[n-1]=nums[n-1];
11        for(int i=n-2;i>=0;i--){
12            rmx[i]=Math.max(rmx[i+1],nums[i]);
13        }
14        long ans=0;
15        for(int i=1;i<n-1;i++){
16            long val=((long)lmx[i-1]-nums[i])*rmx[i+1];
17            ans=Math.max(ans,val);
18        }
19        return ans;
20    }
21}