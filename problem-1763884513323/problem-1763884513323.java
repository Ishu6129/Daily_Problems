// Last updated: 23/11/2025, 13:25:13
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int ans=0;
        for(int i:nums){
            if(i==1) c++;
            else{
                ans=Math.max(ans,c);
                c=0;
            }
        }
        ans=Math.max(ans,c);
        return ans;
    }
}