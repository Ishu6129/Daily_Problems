// Last updated: 8/19/2026, 12:53:54 AM
1class AllOne {
2    Map<String,Integer> map;
3    TreeMap<Integer, Set<String>> freq;
4    public AllOne() {
5        map=new HashMap<>();
6        freq = new TreeMap<>();
7    }
8    
9    public void inc(String key) {
10        int old=map.getOrDefault(key,0);
11        int next=old + 1;
12        map.put(key,next);
13        if (old>0) {
14            freq.get(old).remove(key);
15            if (freq.get(old).isEmpty()) {
16                freq.remove(old);
17            }
18        }
19        freq.computeIfAbsent(next,k->new HashSet<>()).add(key);
20    }
21    
22    public void dec(String key) {
23        int old=map.get(key);
24        int next=old-1;
25        freq.get(old).remove(key);
26        if (freq.get(old).isEmpty()) {
27            freq.remove(old);
28        }
29        if (next==0) {
30            map.remove(key);
31        }
32        else {
33            map.put(key,next);
34            freq.computeIfAbsent(next,k->new HashSet<>()).add(key);
35        }
36    }
37    
38    public String getMaxKey() {
39        if(freq.isEmpty()) return "";
40        return freq.lastEntry().getValue().iterator().next();
41    }
42    
43    public String getMinKey() {
44        if(freq.isEmpty()) return ""; 
45        return freq.firstEntry().getValue().iterator().next();
46    }
47}
48
49/**
50 * Your AllOne object will be instantiated and called as such:
51 * AllOne obj = new AllOne();
52 * obj.inc(key);
53 * obj.dec(key);
54 * String param_3 = obj.getMaxKey();
55 * String param_4 = obj.getMinKey();
56 */