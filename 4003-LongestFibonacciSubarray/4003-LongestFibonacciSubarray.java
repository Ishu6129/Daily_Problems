// Last updated: 12/10/2025, 00:52:59
class Solution {
    public int longestSubarray(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=2;
        int mx=2;
        for(int i=2;i<nums.length;i++){
            if(a+b==nums[i]){
                c++;
                mx=Math.max(mx,c);
            }
            else{
                c=2;
            }
            a=b;
            b=nums[i];
        }
        return mx;
        
    }
}