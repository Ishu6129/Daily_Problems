// Last updated: 7/17/2026, 9:53:50 PM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        HashMap<String,Integer> map=new HashMap<>();
4        int n=s.length();
5        for(int i=0;i<n-9;i++){
6            String sub=s.substring(i,i+10);
7            map.put(sub,map.getOrDefault(sub,0)+1);
8        }
9        List<String> ans=new ArrayList<>();
10        for(String i:map.keySet()){
11            if(map.get(i)>1) ans.add(i);
12        }
13        return ans;
14    }
15}