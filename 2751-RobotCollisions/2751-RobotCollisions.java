// Last updated: 01/04/2026, 21:39:45
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
13        int n=positions.length;
14        Pair[] arr=new Pair[n];
15        for(int i=0;i<n;i++){
16            arr[i]=new Pair(positions[i],healths[i],directions.charAt(i));
17        }
18        Arrays.sort(arr,(a,b)->a.pos-b.pos);
19        HashMap<Integer,Integer> map=new HashMap<>();
20        Stack<Pair> st = new Stack<>();
21        for(int i=0;i<n;i++){
22            Pair curr=arr[i];
23            boolean collide=false;
24            while (!st.isEmpty() && curr.dir=='L' && st.peek().dir=='R') {
25                if (curr.hlth>st.peek().hlth){
26                    curr.hlth-=1;
27                    st.pop();
28                } 
29                else if (curr.hlth==st.peek().hlth) {
30                    st.pop();
31                    collide = true;
32                    break;
33                }
34                else {
35                    st.peek().hlth-=1;
36                    collide = true;
37                    break;
38                }
39            }
40            if (!collide) {
41                st.push(curr);
42            }
43        }
44        for (Pair ele:st) map.put(ele.pos,ele.hlth);
45        List<Integer> ans=new ArrayList<>();
46        for(int i:positions){
47            if(map.containsKey(i)){
48                ans.add(map.get(i));
49            }
50        }
51        return ans;
52    }
53}