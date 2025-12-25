// Last updated: 25/12/2025, 11:35:01
1class Solution {
2    public int countNicePairs(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            int rev=reverse(nums[i]);
6            int numput=nums[i]-rev;
7            map.put(numput,map.getOrDefault(numput,0)+1);
8        }
9        long ans=0;
10        for(int i:map.keySet()){
11            long freq = map.get(i);
12            ans = (ans+(freq*(freq-1)/2)%1000000007)%1000000007;
13        }
14        return (int)ans;
15    }
16    public int reverse(int num){
17        int rev=0;
18        while (num>0) {
19            rev=(rev*10)+(num%10);
20            num/= 10;
21        }
22        return rev;
23    }
24}