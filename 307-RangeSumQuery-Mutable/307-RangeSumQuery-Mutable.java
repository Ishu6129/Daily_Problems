// Last updated: 20/03/2026, 00:23:48
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
21    private void update(int idx,int l,int r,int targetIdx,int val){
22        if(l==r){
23            st[idx]=val;
24            arr[targetIdx]=val;
25            return;
26        }
27        int mid=l+(r-l)/2;
28        if(targetIdx<=mid){
29            update(2*idx,l,mid,targetIdx,val);
30        }
31        else{
32            update(2*idx+1,mid+1,r,targetIdx,val);
33        }
34        st[idx]=st[2*idx]+st[2*idx+1];
35    
36
37    }
38    public void update(int index, int val) {
39        // System.out.println("Before: "+Arrays.toString(arr));
40        update(1,0,arr.length-1,index,val);
41        // System.out.println("After: "+Arrays.toString(arr));
42    }
43
44    private int find(int idx,int sl,int sr,int l,int r){
45
46        if( sl>r || sr<l) return 0;
47        if( sl<=l && r<=sr) return st[idx];
48        int mid = l+(r-l)/2;
49        return find(2*idx,sl,sr,l,mid)+find(2*idx+1,sl,sr,mid+1,r);
50    }
51    public int sumRange(int left, int right) {
52        return find(1,left,right,0,arr.length-1);
53    }
54}
55
56/**
57 * Your NumArray object will be instantiated and called as such:
58 * NumArray obj = new NumArray(nums);
59 * obj.update(index,val);
60 * int param_2 = obj.sumRange(left,right);
61 */