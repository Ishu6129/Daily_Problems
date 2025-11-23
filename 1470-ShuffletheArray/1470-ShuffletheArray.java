// Last updated: 23/11/2025, 13:58:20
class Solution {
    public int[] shuffle(int[] nums, int n) {
        place(nums,0,n);
        return nums;
    }
    public void place(int[] nums,int idx,int n){
        if(idx==n) return;
        int x=nums[idx];
        int y=nums[n+idx];
        place(nums,idx+1,n);
        nums[2*idx]=x;
        nums[2*idx+1]=y;

    }
}