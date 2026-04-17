// Last updated: 17/04/2026, 11:55:25
1class Solution {
2    public int minMirrorPairDistance(int[] nums) {
3        int n=nums.length;
4        int ans=n;
5        Map<Integer,Integer> map=new HashMap<>();
6        for(int i=0;i<n;i++){
7            if(map.containsKey(nums[i])) {
8                ans=Math.min(ans,i-map.get(nums[i]));
9            }
10            int rev=reverse(nums[i]);
11            map.put(rev,i);
12            
13        }
14        return ans==n?-1:ans;
15    }
16    public int reverse(int num){
17        int rev=0;
18        while(num!=0){
19            rev=rev*10+(num%10);
20            num/=10;
21        }
22        return rev;
23    }
24}