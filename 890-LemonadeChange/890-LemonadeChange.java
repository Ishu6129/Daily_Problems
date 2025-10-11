// Last updated: 12/10/2025, 00:54:44
class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                map.put(bills[i],map.getOrDefault(bills[i],0)+1);
            }
            else if(bills[i]==10){
                map.put(bills[i],map.getOrDefault(bills[i],0)+1);
                if(map.getOrDefault(5,0)==0) return false;
                map.put(5,map.get(5)-1);
            }
            else {
                map.put(bills[i], map.getOrDefault(bills[i], 0) + 1);
                if (map.getOrDefault(10,0) > 0 && map.getOrDefault(5,0) > 0) {
                    map.put(10, map.get(10) - 1);
                    map.put(5, map.get(5) - 1);
                } else if (map.getOrDefault(5,0) >= 3) {
                    map.put(5, map.get(5) - 3);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}