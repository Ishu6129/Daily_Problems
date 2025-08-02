// Last updated: 02/08/2025, 23:10:35
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            max=Math.max(max,sum(accounts[i]));
        }  
        return max;
    }
    public int sum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}