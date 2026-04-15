// Last updated: 15/04/2026, 16:19:19
1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int n=words.length;
4        boolean flag=true;
5        for(int i=0;i<n;i++){
6            if(words[i].equals(target)) flag=false;
7        }
8        if(flag) return -1;
9        int ans=Integer.MAX_VALUE;
10        for(int i=0;i<n;i++){
11            if(words[(startIndex+i)%n].equals(target)) ans=Math.min(ans,i);
12            if(words[(startIndex-i+n)%n].equals(target)) ans=Math.min(ans,i);
13        }
14        return ans;
15    }
16}