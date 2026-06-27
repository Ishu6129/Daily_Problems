// Last updated: 6/27/2026, 4:29:10 PM
1class Solution {
2    public int maximumLength(int[] nums) {
3        Map<Integer,Integer> map=new HashMap<>();
4        for(int i:nums){
5            int freq=map.getOrDefault(i,0)+1;
6            map.put(i,freq);
7        }
8        int ans=1;
9        int n=nums.length;
10        Set<Integer> set=new HashSet<>();
11        if(map.containsKey(1)){
12            int freq=map.get(1);
13            if(freq%2==0) ans=freq-1;
14            else ans=freq;
15        }
16        for(int i=0;i<n;i++){
17            if(nums[i]==1) continue;
18            if(!set.contains(nums[i])){
19                int c=1;
20                int x=nums[i];
21                while(map.getOrDefault(x,0)>=2){    
22                    set.add(x);
23                    x=x*x;
24                    c+=2;
25                }
26                if(map.containsKey(x)) ans=Math.max(ans,c);
27                else ans=Math.max(ans,c-2);
28                
29            }
30        }
31        return ans;
32    }
33}