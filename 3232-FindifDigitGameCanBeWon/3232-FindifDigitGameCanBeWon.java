// Last updated: 01/08/2025, 00:34:08
class Solution {
    public boolean canAliceWin(int[] nums) {
        int s_sum=0;
        int d_sum=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]<10) s_sum+=nums[i];
            else d_sum+=nums[i];
            if(nums[j]<10) s_sum+=nums[j];
            else d_sum+=nums[j];
            i++;
            j--;
        }
        if(nums.length%2!=0){
            if(nums[nums.length/2]<10) s_sum+=nums[nums.length/2];
            else d_sum+=nums[nums.length/2];
        }
        return d_sum!=s_sum;
    }
}
