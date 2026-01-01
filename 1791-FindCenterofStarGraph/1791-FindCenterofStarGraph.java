// Last updated: 01/01/2026, 10:46:58
1class Solution {
2    public int findCenter(int[][] edges) {
3        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
4        Set<Integer> set=new HashSet<>();
5        for(int[] i:edges){
6            set.add(i[0]);
7            set.add(i[1]);
8        }
9        for(int i=1;i<=set.size();i++){
10            map.put(i,new ArrayList<>());
11        }
12        for(int i[]:edges){
13            map.get(i[0]).add(i[1]);
14            map.get(i[1]).add(i[0]);
15        }
16        for(int key:map.keySet()){
17            if(map.get(key).size()==(set.size()-1)) return key;
18        }
19        return -1;
20    }
21}