// Last updated: 24/12/2025, 13:59:50
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        if(word1.length()!=word2.length()) return false;
4        int[] freq1=new int[26];
5        int[] freq2=new int[26];
6        for(int i=0;i<word1.length();i++) {
7            freq1[word1.charAt(i)-'a']++;
8            freq2[word2.charAt(i) - 'a']++;
9        }
10        for(int i=0;i<26;i++){
11            if((freq1[i]==0 && freq2[i]>0)||(freq2[i]==0 && freq1[i]>0)) return false;
12        }
13        Arrays.sort(freq1);
14        Arrays.sort(freq2);
15        return Arrays.equals(freq1,freq2);
16    }
17}