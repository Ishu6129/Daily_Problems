// Last updated: 21/02/2026, 11:35:28
1class Solution {
2    static Set<Integer> set=Set.of(2,3,5,7,11,13,17,19);
3    public int countPrimeSetBits(int left, int right) {
4        int ans=0;
5        for(int i=left;i<=right;i++){
6            if(check(i)) ans++;
7        }
8        return ans;
9    }
10    public static boolean check(int n){
11        int c=0;
12        while(n>0){
13            if((n&1)==1) c++;
14            n=n>>1;
15        }
16        return set.contains(c);
17    }
18}