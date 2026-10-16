// Last updated: 10/16/2026, 6:23:22 PM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        int[] arr=new int[26];
4        for(char ch:magazine.toCharArray()){
5            arr[ch-'a']++;
6        }
7        for(char ch:ransomNote.toCharArray()){
8            arr[ch-'a']--;
9            if(arr[ch-'a']<0) return false;
10        }
11        return true;
12    }
13}