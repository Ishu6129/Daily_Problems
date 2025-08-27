// Last updated: 27/08/2025, 12:29:33
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        Arrays.sort(nums);
        int max=0;
        int c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]) continue;
            if(nums[i+1]-nums[i]==1){
                c++;
            }
            else{
                max=Math.max(max,c);
                c=1;
            } 
        }
        max=Math.max(max,c);
        return max;
    }
}