// Last updated: 24/11/2025, 19:06:48
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int num=0;
        for(int i:nums){
            num = (num*2+i)%5;
            ans.add(num == 0);
        }
        return ans;
    }
}