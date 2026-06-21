// Last updated: 6/21/2026, 8:33:37 AM
1class Solution {
2    public int countValidSubarrays(int[] nums, int x) {
3        int n=nums.length;
4        int ans=0;
5        for(int i=0;i<n;i++){
6            long sum=0;
7            for(int j=i;j<n;j++){
8                sum+=nums[j];
9                long c=((long)Math.pow(10,(long)(Math.log10(sum))));
10                long st=sum/c;
11                long ed=sum%10;
12                if(ed==x && st==x) {
13                    ans++;
14                }
15            }
16        }
17        return ans;
18    }
19}