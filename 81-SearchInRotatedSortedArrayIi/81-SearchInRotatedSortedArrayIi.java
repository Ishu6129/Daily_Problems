// Last updated: 24/08/2025, 22:49:37
class Solution {
    public boolean search(int[] nums, int target) {
       int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target) return true;  
            if(nums[mid]==nums[i] && nums[j]==nums[mid]){
                i++;
                j--;
                continue;
            }
            if(nums[i]<=nums[mid]){
                if(nums[i]<=target && target<=nums[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return false;
    }
}