// Last updated: 05/01/2026, 10:52:48
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        List<String> l0=new ArrayList<>();
4        List<String> l1=new ArrayList<>();
5        int n=words.length;
6        int flag0=0;
7        int flag1=1;
8        for(int i=0;i<n;i++){
9            if(flag0==groups[i]){
10                l0.add(words[i]);
11                flag0=1-flag0;
12            }
13            if(flag1==groups[i]){
14                l1.add(words[i]);
15                flag1=1-flag1;
16            }
17        }
18        if(l0.size()>l1.size()) return l0;
19        return l1;
20    }
21}