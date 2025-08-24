// Last updated: 24/08/2025, 22:49:45
class Solution {
    public int[][] generateMatrix(int n) {
        return clockWise(n);
    }
    public int[][] clockWise(int n){
        int[][] arr=new int[n][n];
        int minc=0,minr=0,maxc=arr[0].length-1,maxr= arr.length-1;
        int t=arr.length*arr[0].length;
        int c=0;
        int elem=1;
        while(c<t) {
            for (int i = minc; i <= maxc && c<t; i++) {
                arr[minr][i]=elem;
                elem++;
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr && c<t; i++) {
                arr[i][maxc]=elem;
                elem++;
                c++;
            }
            maxc--;
            for (int i = maxc; i >= minc && c<t; i--) {
                arr[maxr][i]=elem;
                elem++;
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c<t; i--) {
                arr[i][minc]=elem;
                elem++;
                c++;
            }
            minc++;
        }
        return arr;
    }
}