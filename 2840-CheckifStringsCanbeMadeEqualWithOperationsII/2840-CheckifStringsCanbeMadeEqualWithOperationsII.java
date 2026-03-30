// Last updated: 30/03/2026, 17:54:19
1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int[] odd1=new int[26];
4        int[] even1=new int[26];
5        int[] odd2=new int[26];
6        int[] even2=new int[26];
7        int n=s1.length();
8        for(int i=0;i<n;i++){
9            int ch1=s1.charAt(i);
10            int ch2=s2.charAt(i);
11            if(i%2==0){
12                even1[ch1-'a']++;
13                even2[ch2-'a']++;
14            }
15            else{
16                odd1[ch1-'a']++;
17                odd2[ch2-'a']++;
18            }
19        }
20        return Arrays.equals(even1,even2)&&Arrays.equals(odd1,odd2);
21    }
22}