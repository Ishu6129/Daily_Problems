// Last updated: 23/12/2025, 18:26:59
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        int c=0;
4        int loop=Math.min(s1.length(),Math.min(s2.length(),s3.length()));
5        for(int i=0;i<loop;i++){
6            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
7                c++;
8            }
9            else{
10                break;
11            }
12        }
13        return c==0?-1:((s1.length()-c)+(s2.length()-c)+(s3.length()-c));
14    }
15}