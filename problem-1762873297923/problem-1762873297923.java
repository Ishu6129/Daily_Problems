// Last updated: 11/11/2025, 20:31:37
class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp=new int[m+1][n+1][strs.length];
        return find(strs,m,n,0);
    }
    public int find(String[] strs,int z,int o,int idx){
        if(idx==strs.length || z+o==0){
            return 0;
        }
        int[] c =count(strs[idx]);
        if(dp[z][o][idx]>0) return dp[z][o][idx];
        int pk=0;
        if(z>=c[0] && o>=c[1]){
            pk=1+find(strs,z-c[0],o-c[1],idx+1);
        }
        int np=find(strs,z,o,idx+1);
        return dp[z][o][idx]=Math.max(pk,np);
    }
    public int[] count(String s){
        int[] arr=new int[2];
        for(char c:s.toCharArray()){
            arr[c-'0']++;
        }
        return arr;
    }
}