// Last updated: 31/07/2025, 19:32:21
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int c=0;
        int i=0;
        int j=nums.size()-1;
        while(i<j){
            if(!(nums.get(i)+nums.get(j)<target)){
                j--;
            }
            else{
                c+=(j-i);
                i++;
            }
        }
        return c;
    }
}