// Last updated: 8/19/2026, 12:23:23 AM
1class RandomizedCollection {
2    Map<Integer,Integer> map;
3    List<Integer> ls;
4    int total;
5    public RandomizedCollection() {
6        map=new HashMap<>();
7        ls=new ArrayList<>();
8        total=0;
9    }
10    
11    public boolean insert(int val) {
12        ls.add(val);
13        total++;
14        if(!map.containsKey(val)){
15            map.put(val,1);
16            return true;
17        }
18        map.put(val,map.get(val)+1);
19        return false;
20    }
21    
22    public boolean remove(int val) {
23        if(map.containsKey(val)){
24            map.put(val,map.get(val)-1);
25            if(map.get(val)==0) map.remove(val);
26            ls.remove(Integer.valueOf(val));
27            total--;
28            return true;
29        }
30        return false;
31    }
32    
33    public int getRandom() {
34        int idx=(int)(Math.random()*total);
35        return ls.get(idx);
36    }
37}
38
39/**
40 * Your RandomizedCollection object will be instantiated and called as such:
41 * RandomizedCollection obj = new RandomizedCollection();
42 * boolean param_1 = obj.insert(val);
43 * boolean param_2 = obj.remove(val);
44 * int param_3 = obj.getRandom();
45 */