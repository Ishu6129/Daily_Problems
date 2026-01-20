// Last updated: 20/01/2026, 12:00:19
1class Solution {
2    public int minLength(String s) {
3        StringBuilder sb=new StringBuilder(s);
4        while(sb.indexOf("AB")!=-1 || (sb.indexOf("CD")!=-1)){
5            int abidx=sb.indexOf("AB");
6            if(abidx!=-1){
7                sb.delete(abidx,abidx+2);
8            }
9            int cdidx=sb.indexOf("CD");
10            if(cdidx!=-1){
11                sb.delete(cdidx,cdidx+2);
12            }
13        }
14        return sb.length();
15    }
16}