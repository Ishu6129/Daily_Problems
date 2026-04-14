// Last updated: 14/04/2026, 16:35:41
1class Solution {
2    int[] st;
3    int arr[];
4    public void build(int node,int l,int r){
5        if(l==r){
6            st[node]=0;
7            return;
8        }
9        int mid=l+(r-l)/2;
10        build(2*node,l,mid);
11        build(2*node+1,mid+1,r);
12        st[node]=st[2*node]+st[2*node+1];
13
14    }
15    public  void update(int idx,int l,int r,int pos){
16        if(l==r){
17            st[idx]++;
18            return;
19        }
20        int mid=l+(r-l)/2;
21        if(pos<=mid){
22            update(2*idx,l,mid,pos);
23        } else {
24            update(2*idx+1,mid+1,r,pos);
25        }
26        st[idx]=st[2*idx]+st[2*idx+1];
27    }
28    private int query(int idx,int sl,int sr,int l,int r){
29        if( sl>r || sr<l) return 0;
30        if(sl <= l && r <= sr) return st[idx];
31        int mid = l+(r-l)/2;
32        return query(2*idx,sl,sr,l,mid)+query(2*idx+1,sl,sr,mid+1,r);
33    }
34     public int sumRange(int left, int right) {
35        return query(1,left,right,0,arr.length-1);
36    }
37    public List<Integer> countSmaller(int[] nums) {
38
39        TreeSet<Integer> set=new TreeSet<>();
40        for(int i:nums) set.add(i);
41        int n=set.size();
42        int[] narr=new int[n];
43        int idx=0;
44        for(int i:set){
45            narr[idx++]=i;
46        }
47        st=new int[4*n];
48        arr=narr;
49        build(1,0,n-1);
50        Map<Integer, Integer> map = new HashMap<>();
51        for (int i=0;i<n;i++) {
52            map.put(narr[i],i);
53        }
54        int m=nums.length;
55        List<Integer> ans = new ArrayList<>(Collections.nCopies(m, 0));
56        for(int i=m-1;i>=0;i--){
57            int pos =map.get(nums[i]);
58            ans.set(i,sumRange(0,pos-1));
59            update(1,0,arr.length-1,pos);
60        }
61        return ans;
62    }
63}