// Last updated: 31/07/2025, 19:42:23
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[nums1.length + i] = nums2[i];
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            return ((double)arr[arr.length/2]+(double)arr[arr.length/2-1])/2;
        }
        else{
            return (double)arr[arr.length/2];
        }
    }
}