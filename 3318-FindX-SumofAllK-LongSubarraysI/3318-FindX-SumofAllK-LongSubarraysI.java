// Last updated: 04/11/2025, 20:09:26
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans=new int[nums.length/3][3];
        int idx=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-2]-nums[i-1]<=k && nums[i-1]-nums[i]<=k && 
            nums[i]-nums[i-2]<=k){
                ans[idx][0]=nums[i-2];
                ans[idx][1]=nums[i-1];
                ans[idx][2]=nums[i];
                idx++;
                i++;
                i++;
            }
            else return new int[0][];
        }
        return ans;
    }
}