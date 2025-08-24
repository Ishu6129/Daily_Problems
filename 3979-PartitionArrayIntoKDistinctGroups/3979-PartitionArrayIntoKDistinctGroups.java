// Last updated: 24/08/2025, 22:47:35
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length%k!=0) return false;
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            max=Math.max(max,map.get(i));
        }
        if(max>nums.length/k) return false;
        return true;
        
    }
}