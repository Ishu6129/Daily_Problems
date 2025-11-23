// Last updated: 23/11/2025, 11:52:15
class Solution {
    public int maxSumDivThree(int[] nums) {
      int sum=0;
      int one=40001;
      int two=40001;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(nums[i]%3==1) {
            two=Math.min(two,nums[i]+one);
            one=Math.min(one,nums[i]);
        }
        if(nums[i]%3==2) {
            one=Math.min(one,nums[i]+two);
            two=Math.min(two,nums[i]);
        }
      }
      if(sum%3==0) return sum;
      if(sum%3==1) return sum-one;
      return sum-two;

    }
}