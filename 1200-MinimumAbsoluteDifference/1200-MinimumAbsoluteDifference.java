// Last updated: 26/01/2026, 13:46:38
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        int min=Integer.MAX_VALUE;
5        int n=arr.length;
6        for(int i=1;i<n;i++){
7            min=Math.min(min,arr[i]-arr[i-1]);
8        }
9        List<List<Integer>> ans=new ArrayList<>();
10        for(int i=1;i<n;i++){
11            if((arr[i]-arr[i-1])==min){
12                ans.add(Arrays.asList(arr[i-1],arr[i]));
13            }
14        }
15        return ans;
16    }
17}