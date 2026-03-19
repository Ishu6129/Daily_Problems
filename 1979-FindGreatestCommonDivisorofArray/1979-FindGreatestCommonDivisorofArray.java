// Last updated: 20/03/2026, 01:22:12
class Solution {
    public int findGCD(int[] nums) {
        int min=10001,max=0;
        int ans=1;
        for(int i:nums){
            if(min>i) min=i;
            if(max<i) max=i;
        }
        for(int i=2;i<=max;i++){
            if(max%i==0 && min%i==0){
                ans=i;
            }
        }
        return ans;
    }
}