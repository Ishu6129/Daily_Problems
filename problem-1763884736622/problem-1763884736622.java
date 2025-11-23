// Last updated: 23/11/2025, 13:28:56
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int idx=0;
        for(int i=0;i<n;i++){
            ans[idx++]=nums[i];
            ans[idx++]=nums[n+i];
        }
        return ans;
    }
}