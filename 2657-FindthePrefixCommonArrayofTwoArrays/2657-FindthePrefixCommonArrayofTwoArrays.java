// Last updated: 5/20/2026, 9:34:33 AM
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        Set<Integer> s1=new HashSet<>();
4        Set<Integer> s2=new HashSet<>();
5        for(int i=0;i<A.length;i++){
6            s1.add(A[i]);
7            s2.add(B[i]);
8        }
9        int c=s1.size();
10        int ans[]=new int[c];
11        for(int i=c-1;i>=0;i--){
12            ans[i]=c;
13            if(s1.contains(A[i])) s1.remove(A[i]);
14            if(s2.contains(A[i])) s2.remove(A[i]);
15            if(s1.contains(B[i])) s1.remove(B[i]);
16            if(s2.contains(B[i])) s2.remove(B[i]);
17            c=Math.min(s1.size(),s2.size());
18        }
19        return ans;
20    }
21}