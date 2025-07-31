// Last updated: 31/07/2025, 19:40:49
class Solution {
    public void sortColors(int[] nums) {
        int j=0;
        j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=2){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}