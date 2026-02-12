// Last updated: 12/02/2026, 11:51:54
1class Solution {
2    public int longestBalanced(String s) {
3        HashMap<Character,Integer> map;
4        int ans=Integer.MIN_VALUE;
5        for(int i=0;i<s.length();i++){
6            map=new HashMap<>();
7            for(int j=i;j<s.length();j++){
8                char ch=s.charAt(j);
9                map.put(ch,map.getOrDefault(ch,0)+1);
10                int val=map.get(ch);
11                int c=0;
12                boolean flag=false;
13                for(char key:map.keySet()){
14                    if(map.get(key)!=val){
15                        flag=true;
16                        break;
17                    }
18
19                    c+=val;
20                }
21                if(!flag){
22                    ans=Math.max(ans,c);
23                }
24            }
25        }
26        return ans;
27    }
28}