// Last updated: 29/09/2025, 13:34:02
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            c+=count(grid[i]);
        }
        return c;
    }
    public int count(int[] arr){
        int c=0;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]>=0){
                i=mid+1;
            }
            else{
                c+=(j-mid+1);
                j=mid-1;
            }
        }
        return c;
    }
}