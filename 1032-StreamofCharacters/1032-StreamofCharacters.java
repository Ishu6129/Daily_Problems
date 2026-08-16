// Last updated: 8/16/2026, 9:36:04 PM
1class KthLargest {
2    List<Integer> ls=new ArrayList<>();
3    int k;
4    int sz=0;
5    public KthLargest(int k, int[] nums) {
6        this.k=k;
7        for(int i:nums) ls.add(i);
8        sz=nums.length;
9    }
10    
11    public int add(int val) {
12        ls.add(val);
13        sz++;
14        Collections.sort(ls);
15        return ls.get(sz-k);
16    }
17}
18
19/**
20 * Your KthLargest object will be instantiated and called as such:
21 * KthLargest obj = new KthLargest(k, nums);
22 * int param_1 = obj.add(val);
23 */