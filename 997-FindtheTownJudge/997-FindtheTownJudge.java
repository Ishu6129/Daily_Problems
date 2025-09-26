// Last updated: 26/09/2025, 21:01:07
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] arr=new int[n][n];
        for(int i=0;i<trust.length;i++){
            arr[trust[i][0]-1][trust[i][1]-1]=1;
        }
        for(int i=0;i<n;i++){
            if(h_check(arr[i])){
                if(v_check(arr,i)) return i+1;
            }
        }
        return -1;
    }
    public boolean h_check(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)return false;
        }
        return true;
    }
    public boolean v_check(int[][] arr,int idx){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][idx]==1){
                c++;
            }
        }
        return c==arr.length-1;
    }
}