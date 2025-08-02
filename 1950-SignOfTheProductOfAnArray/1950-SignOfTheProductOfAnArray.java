// Last updated: 02/08/2025, 23:10:33
class Solution {
    public int arraySign(int[] nums) {
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            prod=prod*signFunc(nums[i]);
        }
        return signFunc(prod);
        
    }
    public int signFunc(int x){
        if (x==0) return 0;
        else if(x>0){
            return 1;
        }
        return -1;
    }
}