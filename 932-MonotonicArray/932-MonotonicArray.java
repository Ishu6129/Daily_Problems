// Last updated: 31/07/2025, 19:33:13
class Solution {
    public boolean isMonotonic(int[] nums) {
        int j=nums.length-1;
        boolean asc=true;
        boolean desc=true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                desc = false;  
            }
            if (nums[i] < nums[i - 1]) {
                asc = false;  
            }
        }
        return asc||desc;
    }
}