// Last updated: 26/09/2025, 22:29:45
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j = nums.length-1;
        int[] ans={-1,-1};
        while(i <= j) {
            int mid=i+(j-i)/2;
            if(nums[mid] < target) i=mid+1;
            else j = mid - 1;
        }
        if(i==nums.length || nums[i]!=target) return ans;
        ans[0]=i;
        j = nums.length - 1;
        while(i <= j) {
            int mid=i+(j-i)/ 2;
            if(nums[mid] > target) j=mid-1;
            else i = mid + 1;
        }
        ans[1]=j;
        return ans;
    }
}
