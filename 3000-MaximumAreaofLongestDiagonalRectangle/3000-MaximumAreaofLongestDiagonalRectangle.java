// Last updated: 02/09/2025, 19:13:00
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDig= 0;
        int maxArea=0;
        for(int i=0;i<dimensions.length;i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int currDiag = l * l + w * w;
            int area=l*w;
            int dig=l*l+w*w;
            if(dig>maxDig||(dig==maxDig && area>maxArea)){
                maxDig=dig;
                maxArea=area;
            }
        }  
        return maxArea; 
    }
}