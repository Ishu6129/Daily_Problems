// Last updated: 02/08/2025, 23:10:16
class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length<=1){
            return 0;
        }
        Arrays.sort(nums);
        int keep=1;
        for(int i=0;i<nums.length;i++){
            int min=nums[i];
            long max=(long)min*k;
            int l=i;
            int r=nums.length-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(nums[mid]<=max) l=mid+1;
                else r=mid-1;
            }
            int allow=r-i+1;
            keep=Math.max(keep,allow);
        }
        return nums.length-keep;
    }
}