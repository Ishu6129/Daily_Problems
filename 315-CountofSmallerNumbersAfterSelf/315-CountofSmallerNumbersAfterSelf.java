// Last updated: 14/04/2026, 16:14:37
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
15   private void update(int idx,int l,int r,int pos){
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
28    public void update(int pos) {
29        update(1,0,arr.length-1,pos);
30    }
31    private int query(int idx,int sl,int sr,int l,int r){
32        if( sl>r || sr<l) return 0;
33        if(sl <= l && r <= sr) return st[idx];
34        int mid = l+(r-l)/2;
35        return query(2*idx,sl,sr,l,mid)+query(2*idx+1,sl,sr,mid+1,r);
36    }
37     public int sumRange(int left, int right) {
38        return query(1,left,right,0,arr.length-1);
39    }
40    public List<Integer> countSmaller(int[] nums) {
41
42        TreeSet<Integer> set=new TreeSet<>();
43        for(int i:nums) set.add(i);
44        int n=set.size();
45        int[] narr=new int[n];
46        int idx=0;
47        for(int i:set){
48            narr[idx++]=i;
49        }
50        st=new int[4*n];
51        arr=narr;
52        build(1,0,n-1);
53        Map<Integer, Integer> map = new HashMap<>();
54        for (int i=0;i<n;i++) {
55            map.put(narr[i],i);
56        }
57        int m=nums.length;
58        List<Integer> ans = new ArrayList<>(Collections.nCopies(m, 0));
59        for(int i=m-1;i>=0;i--){
60            int pos =map.get(nums[i]);
61            ans.set(i,sumRange(0,pos-1));
62            update(pos);
63        }
64        return ans;
65    }
66}