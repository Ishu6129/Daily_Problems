// Last updated: 11/11/2025, 19:59:38
class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]!=0)ans=Math.max(nums[j]-nums[i],ans);
            }
        }
        return ans;
    }
}