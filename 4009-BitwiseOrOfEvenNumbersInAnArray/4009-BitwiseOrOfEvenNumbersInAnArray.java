// Last updated: 12/10/2025, 00:52:55
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans=0;
        for(int i:nums){
            if(i%2==0){
                ans|=i;}
        }
        return ans;
    }
}