// Last updated: 31/07/2025, 19:32:23
class Solution {
    public int maxSum(int[] nums) {
        int ans=-1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=fnd(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(arr[i]==arr[j]){
                    if(nums[i]+nums[j]>ans){
                        ans=nums[i]+nums[j];
                    }
                }
            }
        }
        return ans;
    }
    public static int fnd(int n){
        int mx=0;
        int t=n;
        int r;
        while(t>0){
            r=t%10;
            if(r>mx) mx=r;
            t=t/10;
        }
        return mx;
    }
}