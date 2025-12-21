// Last updated: 21/12/2025, 19:23:38
1class Solution {
2    public String makeLargestSpecial(String s) {
3        List<String> ans = new ArrayList<>();
4        int count=0;
5        int idx=0;
6        for (int i=0; i<s.length();i++) {
7            if(s.charAt(i)=='1') {
8                count++;
9            }
10            else{
11                count--;
12            }
13            if(count==0) {
14                ans.add("1"+makeLargestSpecial(s.substring(idx+1,i))+"0");
15                idx=i+1;
16            }
17        }
18        Collections.sort(ans,Collections.reverseOrder());
19        return String.join("", ans);
20    }
21}
22