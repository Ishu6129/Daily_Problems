// Last updated: 5/30/2026, 5:59:39 PM
1class SegmentTree {
2    int seg[];
3    int size;
4
5    SegmentTree(int size) {
6        this.size = size;
7        this.seg = new int[size*4];
8    }
9
10    void insert(int idx, int val, int curr, int l, int r) {
11        if(l==r) {
12            seg[curr] = val;
13            return;
14        }
15        int mid = (l+r)/2;
16
17        if(idx<=mid) {
18            insert(idx, val, curr*2, l, mid);
19        } else {
20            insert(idx, val, curr*2+1, mid+1, r);
21        }
22        seg[curr] = Math.max(seg[curr*2], seg[curr*2+1]);
23    }
24
25    int query(int qleft, int qright, int curr, int l, int r) {
26        // qleft__l__r__qright
27        if(qleft<=l && qright>=r)
28            return seg[curr];
29        int mid = (l+r)/2;
30        int maxGap = 0;
31        // left
32        if(qleft<=mid) {
33            maxGap = Math.max(maxGap, query(qleft, qright, curr*2, l, mid));
34        }
35        if(qright > mid) {
36            maxGap = Math.max(maxGap, query(qleft, qright, curr*2+1, mid+1, r));
37        }
38        return maxGap;
39    }
40
41    void insert(int idx, int val) {
42        insert(idx, val, 1, 0, size);
43    }
44
45    int query(int left, int right) {
46        return query(left, right, 1, 0, size);
47    }
48}
49class Solution {
50    public List<Boolean> getResults(int[][] queries) {
51        int rmax=500001;
52        SegmentTree st=new SegmentTree(rmax);
53        TreeSet<Integer> tset=new TreeSet<>();
54        List<Boolean> ans=new ArrayList<>();
55
56        tset.add(0);
57        tset.add(rmax);
58
59        st.insert(rmax,rmax);
60
61        for(int q[]:queries){
62            if(q[0]==1){
63                int x=q[1];
64                int left=tset.floor(x-1);
65                int right=tset.ceiling(x+1);
66                tset.add(x);
67                st.insert(x,x-left);
68                st.insert(right,right-x);
69            }
70            else{
71                int x=q[1];
72                int size=q[2];
73                //pre-x
74                int prev=tset.floor(x);
75                int maxGap=st.query(0,prev);
76                int max=Math.max(maxGap,x-prev);
77                ans.add(size<=max); 
78            }
79        }
80        return ans;
81    }
82}