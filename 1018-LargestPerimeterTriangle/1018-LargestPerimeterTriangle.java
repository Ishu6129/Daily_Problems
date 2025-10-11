// Last updated: 12/10/2025, 00:54:32
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>1;i--){
            if(nums[i-2]+nums[i-1]>nums[i]) return nums[i-2]+nums[i-1]+nums[i]; 
        }
        return 0;
    }
}