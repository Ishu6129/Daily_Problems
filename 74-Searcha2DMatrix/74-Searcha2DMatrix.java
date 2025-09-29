// Last updated: 29/09/2025, 19:30:43
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return StairCaseSearch(matrix,target);
    }
    public static Boolean StairCaseSearch(int[][] arr,int value){
        int row=0;
        int col= arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==value){
                return true;
            }
            else if (arr[row][col]>value) {
                col--;
            }
            else{
                row++;
            }
        }
        return false;

    }
}