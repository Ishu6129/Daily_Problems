// Last updated: 8/14/2026, 12:59:03 PM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        Map<Character,Integer> map=new HashMap<>();
4        int ans=0;
5        int i=0;
6        int j=0;
7        int n=s.length();
8        char[] nums=s.toCharArray();
9        while(i<n && j<n){
10            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
11            while(map.get(nums[j])>2){
12                map.put(nums[i],map.get(nums[i])-1);
13                i++;
14            }
15            ans=Math.max(ans,j-i+1);
16            j++;
17        }
18        return ans;
19    }
20}