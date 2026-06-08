// Last updated: 6/8/2026, 7:39:01 PM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int n=nums.length;
4        List<Integer> ls1=new ArrayList<>();
5        List<Integer> ls2=new ArrayList<>();
6        int c=0;
7        for(int i:nums){
8            if(i<pivot) ls1.add(i);
9            else if(i>pivot) ls2.add(i);
10            else c++;
11        }
12        int idx=0;
13        int[] ans=new int[n];
14        for(int i:ls1){
15            ans[idx++]=i;
16        }
17        while(c>0){
18            ans[idx++]=pivot;
19            c--;
20        }
21        for(int i:ls2){
22            ans[idx++]=i;
23        }
24        return ans;
25    }
26}