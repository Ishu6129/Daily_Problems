// Last updated: 01/04/2026, 21:24:12
1class Solution {
2    class Pair{
3        int pos;
4        int hlth;
5        char dir;
6        Pair(int pos,int hlth,char dir){
7            this.pos=pos;
8            this.hlth=hlth;
9            this.dir=dir;
10        }
11    }
12    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
13        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.pos-b.pos);
14        int n=positions.length;
15        for(int i=0;i<n;i++){
16            pq.add(new Pair(positions[i],healths[i],directions.charAt(i)));
17        }
18        Pair[] arr=new Pair[n];
19        int idx=0;
20        for(int i=0;i<n;i++){
21            arr[idx++]=pq.poll();
22        }
23        HashMap<Integer,Integer> map=new HashMap<>();
24        Stack<Pair> mid = new Stack<>();
25        for(int i=0;i<n;i++){
26            Pair curr=arr[i];
27            boolean collide=false;
28            while (!mid.isEmpty() && curr.dir=='L' && mid.peek().dir=='R') {
29                if (curr.hlth>mid.peek().hlth){
30                    curr.hlth-=1;
31                    mid.pop();
32                } 
33                else if (curr.hlth==mid.peek().hlth) {
34                    mid.pop();
35                    collide = true;
36                    break;
37                }
38                else {
39                    mid.peek().hlth-=1;
40                    collide = true;
41                    break;
42                }
43            }
44            if (!collide) {
45                mid.push(curr);
46            }
47        }
48        for (Pair ele:mid) map.put(ele.pos,ele.hlth);
49        List<Integer> ans=new ArrayList<>();
50        for(int i:positions){
51            if(map.containsKey(i)){
52                ans.add(map.get(i));
53            }
54        }
55        return ans;
56    }
57}