// Last updated: 7/28/2026, 1:36:26 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int n=s.length();
4        int mid=n/2;
5        boolean flag=false;
6        if(n%2!=0) flag=true;
7        int[] p1=new int[26];
8        int[] p2=new int[26];
9        for(int i=0;i<mid;i++){
10            char ch=s.charAt(i);
11            p1[ch-'a']++;
12        }
13        int st=flag?mid+1:mid;
14        for(int i=st;i<n;i++){
15            char ch=s.charAt(i);
16            p2[ch-'a']++;
17        }
18        StringBuilder sb=new StringBuilder();
19        for(int i=0;i<26;i++){
20            if(p1[i]!=0){
21                int t=p1[i];
22                while(t-->0) sb.append((char)('a'+i));
23            }
24        }
25        if(flag) sb.append(s.charAt(mid));
26        for(int i=25;i>=0;i--){
27            if(p2[i]!=0){
28                int t=p2[i];
29                while(t-->0) sb.append((char)('a'+i));
30            }
31        }
32        return sb.toString();
33    }
34}