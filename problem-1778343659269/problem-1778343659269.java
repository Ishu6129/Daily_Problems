// Last updated: 5/9/2026, 9:50:59 PM
1class Solution {
2    public int minGenerations(int[][] points, int[] target) {
3        Set<List<Integer>> set=new HashSet<>();
4        Map<List<Integer>,Set<List<Integer>>> map=new HashMap<>();
5        List<Integer> tar=Arrays.asList(target[0],target[1],target[2]);
6        for(int[] i:points) set.add(Arrays.asList(i[0],i[1],i[2]));
7        if(set.contains(tar)) return 0;
8        int c=0;
9        while(true){
10            int s=set.size();
11            List<List<Integer>> arr=new ArrayList<>(set);
12            for(int i=0;i<arr.size();i++){
13                for(int j=i+1;j<arr.size();j++){
14                    List<Integer> p1=arr.get(i);
15                    List<Integer> p2=arr.get(j);
16                    if(p1.equals(p2))continue;
17                    if(map.containsKey(p1)&& map.get(p1).contains(p2)) continue;
18                    List<Integer> np=Arrays.asList(
19                        (p1.get(0)+p2.get(0))/2,
20                        (p1.get(1)+p2.get(1))/2,
21                        (p1.get(2)+p2.get(2))/2
22                    );
23                        set.add(np);
24                    map.putIfAbsent(p1,new HashSet<>());
25                    map.putIfAbsent(p2,new HashSet<>());
26                    map.get(p1).add(p2);map.get(p2).add(p1);
27                }
28            }
29            c++;
30            if(set.contains(tar)) return c;
31            if (set.size() == s) return -1; 
32        }
33    }
34}