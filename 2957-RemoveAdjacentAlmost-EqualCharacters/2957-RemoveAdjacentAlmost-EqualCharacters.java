// Last updated: 05/03/2026, 19:29:42
1class Solution {
2    public String countAndSay(int n) {
3        StringBuilder ans=new StringBuilder("1");
4        for(int i=0;i<n-1;i++){
5            StringBuilder temp=new StringBuilder();
6            char pre=ans.charAt(0);
7            int c=1;
8            for(int j=1;j<ans.length();j++){
9                char ch=ans.charAt(j);
10                if(pre==ch) c++;
11                else{
12                    temp.append(c+"").append(pre);
13                    pre=ch;
14                    c=1;
15                }
16            }
17            temp.append(c+"").append(pre);
18            ans=temp;
19        }
20        return ans.toString();
21    }
22}