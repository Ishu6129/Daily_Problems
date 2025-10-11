// Last updated: 12/10/2025, 00:53:02
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] arr= new int[k];
        if(map.size()<k){
            arr=new int[map.size()];
        }
        int j=0;
        for(int i:map.keySet() ){
            arr[j]=i;
            j++;
            if(j==k) return arr;
        }
        return arr;
    }
}