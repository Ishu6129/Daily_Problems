// Last updated: 01/01/2026, 22:06:10
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int pointer=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]%2==0){
6                int temp=nums[pointer];
7                nums[pointer]=nums[i];
8                nums[i]=temp;
9                pointer++;
10            }
11        }
12        return nums;
13    }
14}