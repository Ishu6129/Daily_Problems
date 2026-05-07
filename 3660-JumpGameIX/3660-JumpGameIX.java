// Last updated: 5/7/2026, 12:33:57 PM
1class Solution {
2    public int[] maxValue(int[] nums) {
3        int n=nums.length;
4        int mx[]=new int[n];
5        int mn[]=new int[n];
6        mx[0]=nums[0];
7        for(int i=1;i<n;i++){
8            mx[i]=Math.max(nums[i],mx[i-1]);
9        }
10        mn[n-1]=nums[n-1];
11        for(int i=n-2;i>=0;i--){
12            mn[i]=Math.min(nums[i],mn[i+1]);
13        }
14        int ans[]=new int[n];
15        ans[n-1]=mx[n-1];
16        for(int i=n-2;i>=0;i--){
17            if(mx[i]>mn[i+1]){
18                ans[i]=ans[i+1];
19            }
20            else ans[i]=mx[i];
21        }
22        return ans;
23    }
24}