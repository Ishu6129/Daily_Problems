// Last updated: 7/16/2026, 9:15:27 AM
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
13        System.out.println(Arrays.toString(nums));
14        Arrays.sort(nums);
15        long ans=0;
16        int end=n/2;
17        for(int i=0;i<end;i++){
18            int gc=gcd(nums[i],nums[n-i-1]);
19            ans+=gc;
20        }
21        return ans;
22    }
23}