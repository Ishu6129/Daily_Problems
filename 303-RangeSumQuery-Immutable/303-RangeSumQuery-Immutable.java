// Last updated: 21/03/2026, 00:54:37
1class NumArray {
2    int[] tree;
3    int n; 
4    public void add(int pos,int val){
5        while(pos<=n){
6            tree[pos]+=val;
7            pos+= pos & -pos;
8        }
9    }
10    public int query(int pos){
11        int sum=0;
12        while(pos>0){
13            sum+=tree[pos];
14            pos-= pos & -pos;
15        }
16        return sum;
17    }
18    public NumArray(int[] nums) {
19        n=nums.length;
20        tree=new int[n+1];
21        for(int i=0;i<n;i++){
22            add(i+1,nums[i]);
23        }
24
25    }
26    
27    public int sumRange(int left, int right) {
28        return query(right+1)-query(left);
29    }
30}
31
32/**
33 * Your NumArray object will be instantiated and called as such:
34 * NumArray obj = new NumArray(nums);
35 * int param_1 = obj.sumRange(left,right);
36 */