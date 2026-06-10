// Last updated: 6/10/2026, 2:11:51 PM
1class Node{
2    int min;
3    int max;
4    Node(int min,int max){
5        this.min=min;
6        this.max=max;
7    }
8}
9class Solution {
10    int n;
11    Node[] tree;
12    int[] nums;
13    public void build(int nn,int l,int r){
14        if(l==r){
15            tree[nn]=new Node(nums[l],nums[l]);
16            return;
17        }
18        int mid=l+(r-l)/2;
19        build(2*nn,l,mid);
20        build(2*nn+1,mid+1,r);
21        tree[nn]=new Node(Math.min(tree[2*nn].min,tree[2*nn+1].min),
22                          Math.max(tree[2*nn].max,tree[2*nn+1].max));   
23    }
24    public Node query(int l,int r){
25        return query(0,n-1,l,r,1);
26    }
27    public Node query(int sl,int sr,int l,int r,int nn){
28        if(l>sr || sl>r) return new Node(Integer.MAX_VALUE,Integer.MIN_VALUE);
29        if(l<=sl && sr<=r){
30            return tree[nn];
31        }
32        int mid=sl+(sr-sl)/2;
33        Node left=query(sl,mid,l,r,2*nn);
34        Node right=query(mid+1,sr,l,r,2*nn+1);
35        return new Node(
36            Math.min(left.min,right.min),
37            Math.max(left.max,right.max)
38        );
39    }
40    public long maxTotalValue(int[] nums, int k) {
41        this.nums=nums;
42        this.n=nums.length;
43        tree=new Node[4*n];
44        build(1,0,n-1);
45        PriorityQueue<long[]> pq=new PriorityQueue<>((a,b)->Long.compare(b[0],a[0]));
46        Node value=query(0,n-1);
47        pq.add(new long[]{value.max-value.min,0,n-1});
48        Set<String> vis=new HashSet<>();
49        vis.add(0+"#"+(n-1));
50        long ans=0;
51        while(k>0 && !pq.isEmpty()){
52            long[] curr=pq.poll();
53            ans+=curr[0];
54            k--;
55            int l=(int)curr[1],r=(int)curr[2];
56            if(l+1<=r && !vis.contains((l+1)+"#"+r)){
57                Node val=query(l+1,r);
58                vis.add((l+1)+"#"+r);
59                pq.add(new long[]{val.max-val.min,l+1,r});
60            }
61            if(l<=r-1 && !vis.contains(l+"#"+(r-1))){
62                Node val=query(l,r-1);
63                vis.add(l+"#"+(r-1));
64                pq.add(new long[]{val.max-val.min,l,r-1});
65            }
66        }
67        return ans;
68    }
69}