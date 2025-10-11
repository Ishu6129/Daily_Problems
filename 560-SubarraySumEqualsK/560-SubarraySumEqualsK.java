// Last updated: 12/10/2025, 00:54:59
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int pre=0;
        int cnt=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            int rm=pre-k;
            if(map.containsKey(rm)){
                cnt+= map.get(rm);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return cnt;
    }
}