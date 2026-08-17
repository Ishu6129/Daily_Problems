// Last updated: 8/17/2026, 11:37:14 PM
1class SummaryRanges {
2    int[] arr;
3    int max=0;
4    public SummaryRanges() {
5        arr=new int[10002];
6        Arrays.fill(arr,-1);
7    }
8    
9    public void addNum(int value) {
10        arr[value]=1;
11        max=Math.max(value,max);
12    }
13    
14    public int[][] getIntervals() {
15        List<int[]> ls=new ArrayList<>();
16        int lm=max+1;
17        int mn=10001;
18        int mx=-1;
19        for(int i=0;i<=lm;i++){
20            if(arr[i]==1){
21                while(i<=lm && arr[i]==1){
22                    mn=Math.min(mn,i);
23                    mx=Math.max(mx,i);
24                    i++;
25                }
26            }
27            if(mx!=-1){
28                ls.add(new int[]{mn,mx});
29                mn=10001;
30                mx=-1;
31            }            
32        }
33        int n=ls.size();
34        int[][] ans=new int[n][2];
35        for(int i=0;i<n;i++){
36            ans[i]=ls.get(i);
37        }
38        return ans;
39    }
40}
41
42/**
43 * Your SummaryRanges object will be instantiated and called as such:
44 * SummaryRanges obj = new SummaryRanges();
45 * obj.addNum(value);
46 * int[][] param_2 = obj.getIntervals();
47 */