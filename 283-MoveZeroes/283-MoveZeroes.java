// Last updated: 31/07/2025, 19:33:54
class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(!(nums[i]==0)){
                temp=nums[i];
                nums[i]=nums[count];
                nums[count]=temp;
                count++;
            }
        }
    }
}