// Last updated: 6/30/2026, 5:40:03 PM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] freq=new int[3];
4        int left=0;
5        int right=0;
6        int n=s.length();
7        int ans=0;
8        while(right<n){
9            char ch=s.charAt(right);
10            freq[ch-'a']++;
11            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
12                ans+=(n-right);
13                freq[s.charAt(left)-'a']--;
14                left++;
15            }
16            right++;
17        }
18        return ans;
19    }
20}