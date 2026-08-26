// Last updated: 8/26/2026, 11:30:01 AM
1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3        String ans="";
4        int c=0;
5        StringBuilder sb=new StringBuilder();
6        for(char ch:s.toCharArray()){
7            sb.append(ch);
8            if(ch=='1'){
9                c++;
10            }
11            while(c>k){
12                char f=sb.charAt(0);
13                sb.deleteCharAt(0);
14                if(f=='1') c--;
15            }
16            if(c==k){
17                while(sb.length()>0 && sb.charAt(0)=='0') sb.deleteCharAt(0);
18                String str=sb.toString();
19                if(ans.length()==0 || str.length()<ans.length() ||
20                   (ans.length()==str.length() && compare(str,ans).equals(str))){
21                    ans=str;
22                   } 
23            } 
24             
25        }
26        return ans;
27    }
28    public String compare(String s1,String s2){
29        int n=s1.length();
30        for(int i=0;i<n;i++){
31            if(s1.charAt(i)>s2.charAt(i)) return s2;
32            if(s1.charAt(i)<s2.charAt(i)) return s1;
33        }
34        return s1;
35    }
36}