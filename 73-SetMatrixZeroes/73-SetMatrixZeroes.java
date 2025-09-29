// Last updated: 29/09/2025, 15:27:35
class Solution {
    public void setZeroes(int[][] matrix) {
        find(matrix,0,0);
    }
    public void find(int[][] arr,int i,int j){
        if(i==arr.length-1 && j==arr[i].length ) {
            return;}
        if(j>=arr[i].length && i+1<arr.length) {
            i++;
            j=0;
        }
        if(arr[i][j]==0){
            find(arr,i,j+1);
            set(arr,i,j);
            return;
        }
        find(arr,i,j+1);
    }
    public void set(int[][] arr,int i,int j){
        for(int k=0;k<arr[i].length;k++){
            arr[i][k]=0;
        }
        for(int k=0;k<arr.length;k++){
            arr[k][j]=0;
        }
    }

}