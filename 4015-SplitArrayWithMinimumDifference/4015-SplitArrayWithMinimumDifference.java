// Last updated: 12/10/2025, 00:52:49
class Solution {
    public long splitArray(int[] nums) {
        long[] left=new long[nums.length];
        left[0]=nums[0];
        for(int i=1;i<left.length;i++){
            left[i]=left[i-1]+nums[i];
        }
        long[] right=new long[nums.length];
        right[right.length-1]=nums[nums.length-1];
        for(int i=right.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i];
        }

        boolean[] inc=new boolean[nums.length];
        inc[0]=true;
        for(int i=1;i<nums.length;i++){
            inc[i]=inc[i-1]&&nums[i]>nums[i-1];
        }
        
        boolean[] dec=new boolean[nums.length];
        dec[dec.length-1]=true;
        for(int i=nums.length-2;i>=0;i--){
            dec[i]=dec[i+1]&&nums[i]>nums[i+1];
        }
        long ans=Long.MAX_VALUE;
        boolean found=false;
        for(int i=1;i<nums.length;i++){
            if(inc[i-1]&&dec[i]){
                long diff=Math.abs(left[i-1]-right[i]);
                ans=Math.min(ans,diff);
                found=true;
            }
        }
        
        return found?ans:-1;
    }
}