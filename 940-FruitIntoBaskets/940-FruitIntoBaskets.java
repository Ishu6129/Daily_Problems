// Last updated: 12/10/2025, 00:54:38
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            if(map.size()>2){
                map.put(fruits[c],map.get(fruits[c])-1);
                c++;
                if(map.get(fruits[c-1])==0){
                    map.remove(fruits[c-1]);      
                }
            }
        }
        return fruits.length-c;
    }
}