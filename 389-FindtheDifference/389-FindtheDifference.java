// Last updated: 10/16/2026, 6:30:12 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        int[] arr=new int[26];
4        for(char ch:s.toCharArray()){
5            arr[ch-'a']++;
6        }
7        for(char ch:t.toCharArray()){
8            arr[ch-'a']--;
9        }
10        for(int i=0;i<26;i++){
11            if(arr[i]!=0){
12                return (char)(97+i);
13            }
14        }
15        return ' ';
16    }
17}