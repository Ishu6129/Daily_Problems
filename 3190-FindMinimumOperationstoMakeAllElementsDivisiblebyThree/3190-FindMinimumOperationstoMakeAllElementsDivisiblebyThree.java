// Last updated: 22/11/2025, 15:27:03
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i%3!=0) c++;
        }
        return c;
    }
}