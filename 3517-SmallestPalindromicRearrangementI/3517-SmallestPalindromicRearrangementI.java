// Last updated: 7/28/2026, 1:45:19 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int n=s.length();
4        int mid=n/2;
5        boolean flag=false;
6        if(n%2!=0) flag=true;
7        int[] fh=new int[26];
8        for(int i=0;i<mid;i++){
9            char ch=s.charAt(i);
10            fh[ch-'a']++;
11        }
12        StringBuilder sb=new StringBuilder();
13        for(int i=0;i<26;i++){
14            if(fh[i]!=0){
15                int t=fh[i];
16                while(t-->0) sb.append((char)('a'+i));
17            }
18        }
19        if(flag){
20            StringBuilder sb2=new StringBuilder(sb);
21            sb.append(s.charAt(mid));
22            sb.append(sb2.reverse());
23        }
24        else {
25            StringBuilder sb2=new StringBuilder(sb);
26            sb.append(sb2.reverse());
27        }
28        return sb.toString();
29    }
30}