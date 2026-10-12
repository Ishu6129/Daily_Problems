// Last updated: 10/12/2026, 10:17:04 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] chArr=s.toCharArray();
4        List<Integer> ls=new ArrayList<>();  
5        int n=s.length();
6        for(int i=0;i<n;i++){
7            if("aeiouAEIOU".indexOf(chArr[i])!=-1) ls.add(i);
8        }
9        int len=ls.size();
10        for(int i=0;i<len/2;i++){
11            int first=ls.get(i);
12            int last=ls.get(len-i-1);
13            char temp=chArr[first];
14            chArr[first]=chArr[last];
15            chArr[last]=temp;
16        }
17        return (new String(chArr));
18    }
19}