// Last updated: 5/18/2026, 9:41:42 AM
1class Solution {
2    public int minJumps(int[] arr) {
3        int n=arr.length;
4        Map<Integer,List<Integer>> map=new HashMap<>();
5        for(int i=0;i<n;i++){
6            map.computeIfAbsent(arr[i],k->new ArrayList<>()).add(i);
7        }
8        int[] vis=new int[n];
9        Arrays.fill(vis,-1);
10        Queue<Integer> q=new LinkedList<>();
11        q.add(0);
12        vis[0]=0;
13        while(!q.isEmpty()){
14            int cur=q.poll();
15            if(cur==n-1) return vis[cur];
16            if(cur-1>=0 && vis[cur-1]==-1){
17                q.add(cur-1);
18                vis[cur-1]=vis[cur]+1;
19            }
20            if(cur+1<n && vis[cur+1]==-1){
21                q.add(cur+1);
22                vis[cur+1]=vis[cur]+1;
23            }
24            if(map.containsKey(arr[cur])){
25                for(int idx:map.get(arr[cur])){
26                    if(vis[idx]==-1){
27                        q.add(idx);
28                        vis[idx]=vis[cur]+1;
29                    }
30                }
31                map.remove(arr[cur]);
32            }
33        }
34        return -1;
35    }
36}