// Last updated: 12/10/2025, 00:53:21
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max_frequency=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(max_frequency<map.get(i)) max_frequency=map.get(i);
        }
        int cnt=0;
        for(int i:map.keySet()){
            if(map.get(i)==max_frequency) cnt=cnt+max_frequency;
        }
        return cnt;
    }
}