// Last updated: 02/09/2025, 19:07:35
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDig= Double.MIN_VALUE;
        int maxArea=Integer.MAX_VALUE;
        for(int i=0;i<dimensions.length;i++){
            int area=dimensions[i][0]*dimensions[i][1];
            double dig=Math.sqrt(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]);
            if(dig>maxDig){
                maxDig=dig;
                maxArea=area;
            }
            else if(dig==maxDig && area>maxArea){
                maxArea=area;
            }
        }  
        return maxArea; 
    }
}