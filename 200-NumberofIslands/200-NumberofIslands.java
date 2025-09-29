// Last updated: 29/09/2025, 19:47:22
class Solution {
    public int numIslands(char[][] grid) {
       int count=0;
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1'){
                count++;
                removeConnected(grid,i,j);
            }
        }
       } 
       return count;
    }
    public void removeConnected(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0') return;

        grid[i][j]='0';
        removeConnected(grid,i-1,j);
        removeConnected(grid,i,j-1);
        removeConnected(grid,i+1,j);
        removeConnected(grid,i,j+1);

    }
}