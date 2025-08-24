// Last updated: 24/08/2025, 22:47:52
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i=0;
        long ptr=0;
        long cnt=0;
        while(i<nums.length){
            if(nums[i]==0) ptr++;
            else{
                cnt+=ptr*(ptr+1)/2;
                ptr=0;
            }
            i++;
        }
        if(ptr!=0){
            cnt+=ptr*(ptr+1)/2;
        }
        return cnt;
    }
}