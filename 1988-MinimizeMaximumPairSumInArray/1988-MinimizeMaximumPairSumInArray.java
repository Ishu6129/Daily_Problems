// Last updated: 12/10/2025, 00:53:38
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int mx=0;
        while(i<j){
            mx=Math.max(mx,nums[i]+nums[j]);
            i++;
            j--;
        }
        return mx;
    }
}