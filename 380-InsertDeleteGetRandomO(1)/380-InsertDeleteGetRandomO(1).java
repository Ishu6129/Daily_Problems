// Last updated: 8/19/2026, 12:01:44 AM
1class RandomizedSet {
2    Set<Integer> set;
3    public RandomizedSet() {
4        set=new HashSet<>();
5    }
6    
7    public boolean insert(int val) {
8        return set.add(val);
9    }
10    
11    public boolean remove(int val) {
12        return set.remove(val);
13    }
14    
15    public int getRandom() {
16        int idx=(int)(Math.random()*set.size());
17        for(int i:set){
18            if(idx--==0){
19                return i;
20            }
21        }
22        return -1;
23    }
24}
25
26/**
27 * Your RandomizedSet object will be instantiated and called as such:
28 * RandomizedSet obj = new RandomizedSet();
29 * boolean param_1 = obj.insert(val);
30 * boolean param_2 = obj.remove(val);
31 * int param_3 = obj.getRandom();
32 */