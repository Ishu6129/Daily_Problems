// Last updated: 5/8/2026, 1:03:24 PM
1class Solution {
2    public boolean[] sieve(){
3        int n=1000000;
4        boolean[] sv=new boolean[n+1];
5        sv[0]=true;
6        sv[1]=true;
7        for(int i=2;i*i<=n;i++){
8            if(!sv[i]){
9                for(int j=i*i;j<=n;j+=i){
10                    sv[j]=true;
11                }
12            }
13        }
14        return sv;
15    }
16    public int minJumps(int[] nums) {
17        if(nums.length==1) return 0;
18        boolean[] sv=sieve();
19        int n=nums.length;
20        Map<Integer,List<Integer>> map=new HashMap<>();
21        int max_elem=-1;
22        for(int i=0;i<n;i++){
23            map.putIfAbsent(nums[i],new ArrayList<>());
24            map.get(nums[i]).add(i);
25            max_elem=Math.max(max_elem,nums[i]);
26        }
27        int dist[]=new int[n];
28        Arrays.fill(dist,-1);
29        Queue<Integer> q=new LinkedList<>();
30        Set<Integer> set=new HashSet<>();
31        q.add(0);
32        dist[0]=0;
33        while(!q.isEmpty()){
34            int r=q.poll();
35            set.add(r);
36            List<Integer> nextJump=new ArrayList<>();
37            if(r-1>=0) nextJump.add(r-1);
38            if(r+1<n) nextJump.add(r+1);
39            if(!sv[nums[r]]){
40                int curr=nums[r];
41                for(int i=curr;i<=max_elem;i+=curr){
42                    if(map.containsKey(i)){
43                        for(int v:map.get(i)) nextJump.add(v);
44                        map.remove(i);
45                    }
46                }
47            }
48            for(int next:nextJump){
49                if(dist[next]==-1){
50                    dist[next]=dist[r]+1;
51                    if(next==n-1) return dist[next];
52                    if(!set.contains(next)) q.add(next);
53                }
54            }
55        }
56        return -1;
57    }
58}