// Last updated: 11/12/2026, 2:19:42 PM
1class Solution {
2    public int longestMonotonicSubarray(int[] nums) {
3        int n=nums.length;
4        int mxi=Integer.MIN_VALUE;
5        int mnd=Integer.MIN_VALUE;
6        int[] inc=new int[n];
7        int[] dec=new int[n];
8        Arrays.fill(inc,1);
9        Arrays.fill(dec,1);
10        int ans=1;
11        for(int i=1;i<n;i++){
12            if(nums[i-1]>nums[i]){
13                dec[i]+=dec[i-1];
14            }
15            else if(nums[i-1]<nums[i]){
16                inc[i]+=inc[i-1];
17            }
18            ans=Math.max(ans,Math.max(inc[i],dec[i]));
19        }
20        return ans;
21    }
22}