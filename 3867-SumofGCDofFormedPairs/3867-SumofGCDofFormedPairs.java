// Last updated: 7/16/2026, 9:15:40 AM
1class Solution {
2    public int gcd(int a,int b){
3        if(b==0) return a;
4        return gcd(b,a%b);
5    }
6    public long gcdSum(int[] nums) {
7        int mx=-1;
8        int n=nums.length;
9        for(int i=0;i<n;i++){
10            if(mx<nums[i]) mx=nums[i];
11            nums[i]=gcd(mx,nums[i]);
12        }
13        Arrays.sort(nums);
14        long ans=0;
15        int end=n/2;
16        for(int i=0;i<end;i++){
17            int gc=gcd(nums[i],nums[n-i-1]);
18            ans+=gc;
19        }
20        return ans;
21    }
22}