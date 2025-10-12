// Last updated: 12/10/2025, 15:25:03
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(int i:map.keySet()){
            if(map.get(i)%k==0){
                sum+=(map.get(i)*i);
            }
        }
        return sum;
    }
}