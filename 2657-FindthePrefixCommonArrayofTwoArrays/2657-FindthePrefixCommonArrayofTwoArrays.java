// Last updated: 5/20/2026, 10:07:23 AM
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        Set<Integer> s1=new HashSet<>();
4        Set<Integer> s2=new HashSet<>();
5        int ans[]=new int[A.length];
6        int c=0;
7        for(int i=0;i<A.length;i++){
8            s1.add(A[i]);
9            s2.add(B[i]);
10            if(s1.contains(B[i]) && s2.contains(A[i]) && A[i]==B[i]) c++;
11            else{
12                if(s1.contains(B[i])) c++;
13                if(s2.contains(A[i])) c++;
14            }
15            ans[i]=c;
16        }
17        return ans;
18    }
19}