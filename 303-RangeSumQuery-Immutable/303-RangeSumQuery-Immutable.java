// Last updated: 20/03/2026, 01:00:40
1class NumArray {
2    int[] st;
3    int arr[];
4    public void build(int l,int r,int idx){
5        if(l==r){
6            st[idx]=arr[l];
7            return;
8        }
9        int mid=l+(r-l)/2;
10        build(l,mid,2*idx);
11        build(mid+1,r,2*idx+1);
12        st[idx]=st[2*idx]+st[2*idx+1];
13    }
14    public NumArray(int[] nums) {
15        int n=nums.length;
16        st=new int[4*n];
17        arr=nums;
18        build(0,n-1,1);
19
20    }
21    
22    private int find(int idx,int sl,int sr,int l,int r){
23        if( sl>r || sr<l) return 0;
24        if(sl <= l && r <= sr) return st[idx];
25        int mid = l+(r-l)/2;
26        return find(2*idx,sl,sr,l,mid)+find(2*idx+1,sl,sr,mid+1,r);
27    }
28    public int sumRange(int left, int right) {
29        return find(1,left,right,0,arr.length-1);
30    }
31}
32
33/**
34 * Your NumArray object will be instantiated and called as such:
35 * NumArray obj = new NumArray(nums);
36 * int param_1 = obj.sumRange(left,right);
37 */