// Last updated: 02/08/2025, 23:10:13
class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        int n=nums.length/3;
        int p=n;
        while(n>0){
            sum+=nums[p];
            n--;
            p+=2;
        }
        return sum;
    }
}