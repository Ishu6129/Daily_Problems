// Last updated: 01/01/2026, 12:14:10
1class Solution {
2    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
3        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
4        for(int i=0;i<friends.length;i++){
5            map.put(i,new HashSet<>());
6        }
7        for(int i=0;i<friends.length;i++){
8            for(int j:friends[i]){
9                map.get(i).add(j);
10                map.get(j).add(i);
11            }
12        }
13        List<String> ans =new ArrayList<>();
14        Queue<Integer> q=new LinkedList<>();
15        Set<Integer> vis=new HashSet<>();
16        HashMap<String,Integer> freq=new HashMap<>();
17        q.add(id);
18        vis.add(id);
19        int levelCount=0;
20        while(!q.isEmpty() && levelCount<level){
21            int size=q.size();
22            for(int i=0;i<size;i++){
23                int r=q.poll();
24                for(int nbrs:map.get(r)){
25                    if(!vis.contains(nbrs)){
26                        vis.add(nbrs);
27                        q.add(nbrs);
28                    }
29                }
30            }
31            levelCount++;
32        }
33        while(!q.isEmpty()){
34            int r=q.poll();
35            for(String v:watchedVideos.get(r)){
36                freq.put(v,freq.getOrDefault(v,0)+1);
37            }
38        }
39        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());
40        entries.sort((e1, e2) -> {
41            int freqCompare = e1.getValue().compareTo(e2.getValue());
42            if (freqCompare != 0) {
43                return freqCompare;
44            }
45            return e1.getKey().compareTo(e2.getKey());
46        });
47        
48        for (Map.Entry<String, Integer> e : entries) {
49           ans.add(e.getKey());
50        }
51        return ans;
52    }
53}