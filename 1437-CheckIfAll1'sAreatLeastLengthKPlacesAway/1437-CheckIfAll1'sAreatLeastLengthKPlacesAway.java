// Last updated: 17/11/2025, 14:26:01
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int pointer=-1;
        int i=0;
        while(i<nums.length && nums[i]!=1){
            i++;
        }
        pointer=i;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]==1){
                if(j-pointer-1<k) {
                    return false;
                }
                pointer=j;
            }
        }
        return true;
    }
}