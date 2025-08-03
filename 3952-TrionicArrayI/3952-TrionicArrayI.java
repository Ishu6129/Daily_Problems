// Last updated: 03/08/2025, 21:24:53
class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<=3) return false;
        int p=0;
        while(p<nums.length-1 && nums[p]<nums[p+1]){
            p++;
        }
        if(p==0 || p>=nums.length-2) return false;
        
        int q=p;
        while(q<nums.length-1 && nums[q]>nums[q+1]){
            q++;
        }
        if(q==p || q>=nums.length-1) return false;
        
        while(q<nums.length-1){
            if(nums[q]>=nums[q+1]){
                return false;
            }
            q++;
        }
        return true;
    }
}