// Last updated: 6/11/2026, 9:12:53 PM
1class Solution{
2    long mod=1000000007;
3    public int assignEdgeWeights(int[][] e){
4        Map<Integer,ArrayList<Integer>> m=new HashMap<>();
5        for(int[] i:e){
6            int u=i[0],v=i[1];
7            m.computeIfAbsent(u,k->new ArrayList<>());
8            m.computeIfAbsent(v,k->new ArrayList<>());
9            m.get(u).add(v);
10            m.get(v).add(u);
11        }
12        int mx=0;
13        Stack<int[]> st=new Stack<>();
14        HashSet<Integer> vis=new HashSet<>();
15        st.push(new int[]{1,0});
16        while(!st.isEmpty()){
17            int[] c=st.pop();
18            int u=c[0],d=c[1];
19            if(vis.contains(u)) continue;
20            vis.add(u);
21            mx=Math.max(mx,d);
22            for(int v:m.get(u)){
23                if(!vis.contains(v)){
24                    st.push(new int[]{v,d+1});
25                }
26            }
27        }
28        return (int)pow(2,mx-1);
29    }
30    public long pow(long a,long b){
31        long ans=1;
32        while(b>0){
33            if((b&1)==1) ans=(ans*a)%mod;
34            a=(a*a)%mod;
35            b>>=1;
36        }
37        return ans;
38    }
39}