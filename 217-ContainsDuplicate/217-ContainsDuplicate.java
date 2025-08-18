// Last updated: 18/08/2025, 14:25:54
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(s.contains(nums[i])) {
                return true;
            }
            else{
                s.add(nums[i]);
            }   
            i++;
        }
        return false;
    }
}