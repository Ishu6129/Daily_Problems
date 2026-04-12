// Last updated: 12/04/2026, 23:39:09
1class Solution {
2    Map<Character, int[]> map;
3    int[][][] dp;
4    int n;
5    public int minimumDistance(String word) {
6        map= new HashMap<>();
7        for (char ch='A'; ch<='Z'; ch++) {
8            int idx= ch-'A';
9            int r=idx/6;
10            int c=idx%6;
11            map.put(ch,new int[]{r,c});
12        }
13        n=word.length();
14        dp=new int[27][27][n];
15        for(int[][] i:dp){
16            for(int[] j:i){
17                Arrays.fill(j,-1);
18            }
19        }
20        return find(-1,-1,0,word);
21    }
22    public int find(int i,int j,int curr,String word){
23        if(curr==n) return 0;
24        if(dp[i+1][j+1][curr]!=-1) return dp[i+1][j+1][curr];
25        int nextChar = word.charAt(curr)-'A';
26        int f1=dis(i,curr,word)+find(nextChar,j,curr+1,word);
27        int f2=dis(j,curr,word)+find(i,nextChar,curr+1,word);
28        return dp[i+1][j+1][curr]= Math.min(f1,f2);
29
30    }
31    public int dis(int c,int idx,String word){
32        if(c==-1) return 0;
33        int[] x = map.get((char)(c+'A'));
34        int[] y=map.get(word.charAt(idx));
35        return Math.abs(x[0] - y[0]) + Math.abs(x[1] - y[1]);
36    }
37}