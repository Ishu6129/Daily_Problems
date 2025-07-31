// Last updated: 31/07/2025, 19:34:36
class Solution {
    public int maxProduct(int[] arr) {
        int left=1;
        int right=1;
        int max_prod=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            left=(left==0?1 : left)*arr[i];
            right=(right==0?1 : right)*arr[arr.length-1-i];
            max_prod=Math.max(max_prod,Math.max(left,right));
        }
        return max_prod;
    }
}