// Last updated: 31/07/2025, 19:33:20
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int r =0;r<image.length;r++){
            reverse_invert(image[r]);
        }
        return image;
    }
    public static void reverse_invert(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=1-arr[j];
            arr[j]=1-temp;
            i++;
            j--;
        }
    }
}