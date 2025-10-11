// Last updated: 12/10/2025, 00:53:04
class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> map=new TreeMap<>();
        int t =n;
        while(t>0){
            int r=t%10;
            map.put(r,map.getOrDefault(r,0)+1);
            t=t/10;
        }
        int ans=Integer.MAX_VALUE;
        int res=-1;
        for(int key:map.keySet()){
            if(map.get(key)<ans){
                ans=map.get(key);
                res=key;
            }
        }
        return res;
    }
}