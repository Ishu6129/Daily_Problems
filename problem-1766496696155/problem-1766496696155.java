// Last updated: 23/12/2025, 19:01:36
1class Solution {
2    public String smallestString(String s) {
3        StringBuilder sb=new StringBuilder();
4        int i=0;
5        int n=s.length();
6        while(i<n && s.charAt(i)=='a'){
7            sb.append('a');
8            i++;
9        }  
10        if(i==n){
11            sb.deleteCharAt(sb.length() - 1);
12            sb.append('z');
13            return sb.toString();
14        }
15        while(i<n && s.charAt(i)!='a'){
16            sb.append((char)(s.charAt(i)-1));
17            i++;
18        }
19        while (i<n) {
20            sb.append(s.charAt(i));
21            i++;
22        }
23        return sb.toString();
24    }
25}