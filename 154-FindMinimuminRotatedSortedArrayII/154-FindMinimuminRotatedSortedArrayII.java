// Last updated: 5/16/2026, 1:04:32 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int i=0;
4        int j=nums.length-1;
5        int min=Integer.MAX_VALUE;
6        while(i<=j){
7            int mid=i+(j-i)/2;
8            if(nums[i]<nums[mid]){
9                min=Math.min(min,nums[i]);
10                i=mid+1;
11            }
12            else if(nums[i]>nums[mid]){
13                min=Math.min(min,nums[mid]);
14                j=mid-1;
15            }
16            else{
17                min = Math.min(min, nums[i]);
18                i++;
19            }
20        }
21        return min;
22    }
23}