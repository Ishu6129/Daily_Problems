// Last updated: 12/10/2025, 00:53:01
class Solution {
    public int minOperations(int[] nums) {
        if (nums.length==0) return 0;
        boolean eq=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[0]){
                eq=false;
                break;
            }
        }
        if(eq) return 0;
        return 1;
    }
}