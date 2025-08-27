// Last updated: 27/08/2025, 12:43:53
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int c=0;
                int key=nums[i];
                while(set.contains(key)){
                    set.remove(key);
                    c++;
                    key++;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
}