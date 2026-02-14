// Last updated: 14/02/2026, 22:31:46
1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3        int n=nums.length;
4        int[] result=new int[n];
5        for(int i=0;i<n;i++){
6            if(nums[i]==0){
7                result[i]=nums[i];
8            }
9            else if(nums[i]>0){
10                result[i]=nums[(i+nums[i])%n];
11            }
12            else{
13                int idx=(i+nums[i])%n;
14                if (idx<0) {
15                    idx+=n;
16                }
17                result[i]=nums[idx];
18            }
19
20        }
21        return result;
22    }
23}