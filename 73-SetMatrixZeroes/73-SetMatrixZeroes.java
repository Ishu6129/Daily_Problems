// Last updated: 10/08/2025, 22:13:44
class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) list.add(Arrays.asList(i, j));
            }
        }
        for(int i=0;i<list.size();i++){
            int row=list.get(i).get(0);
            for(int j=0;j<matrix[0].length;j++){
                matrix[row][j]=0;
            }
            int col=list.get(i).get(1);
            for(int j=0;j<matrix.length;j++){
                matrix[j][col]=0;
            }
        }

    }
}