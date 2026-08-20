// Last updated: 8/20/2026, 11:09:05 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        List<Integer> arr1=new ArrayList<>();
4        List<Integer> arr2=new ArrayList<>();
5        arr1.add(nums[0]);
6        arr2.add(nums[1]);
7        int idx=2;
8        int n=nums.length;
9        while(idx<n){
10            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
11                arr1.add(nums[idx]);
12            }
13            else arr2.add(nums[idx]);
14            idx++;
15        }
16        for(int i:arr2) arr1.add(i);
17        return  arr1.stream().mapToInt(Integer::intValue).toArray();
18    }
19}