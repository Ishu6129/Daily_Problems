// Last updated: 31/12/2025, 11:21:24
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
4        for(int i=0;i<numCourses;i++){
5            map.put(i,new ArrayList<>());
6        }
7        for(int[] i :prerequisites){
8            map.get(i[0]).add(i[1]);
9        }
10        int[] in=new int[numCourses];
11        for(int key:map.keySet()){
12            for(int i:map.get(key)){
13                in[i]++;
14            }
15        }
16        Queue<Integer> q=new LinkedList<>();
17        for(int i=0;i<numCourses;i++){
18            if(in[i]==0){
19                q.add(i);
20            }
21        }
22        ArrayList<Integer> ans=new ArrayList<>();
23        while(!q.isEmpty()){
24            int r=q.poll();
25            ans.add(r);
26            for(int nbrs:map.get(r)){
27                in[nbrs]--;
28                if(in[nbrs]==0){
29                    q.add(nbrs);
30                }
31            }
32        }
33        if(ans.size()!=numCourses)return new int[]{};
34        int[] result=new int[ans.size()];
35        int idx=ans.size();;
36        for(int i:ans){
37            result[--idx]=i;
38        }
39        System.out.println(ans);
40        return result;
41    }
42}