// Last updated: 31/07/2025, 19:32:33
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            elementSum+=nums[i];
            digitSum+=digSum(nums[i]);
        }
        return Math.abs(elementSum-digitSum);
    }
    public int digSum(int num){
        int t=num;
        int s=0;
        while(t>0){
            int r=t%10;
            s=s+r;
            t=t/10;
        }
        return s;
    }
}