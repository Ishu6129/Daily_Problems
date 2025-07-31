// Last updated: 31/07/2025, 19:42:06
class Solution {
    public int removeDuplicates(int[] nums) {
        int c=nums[0];
        int t=1;
        for(int i=1;i<nums.length;i++){
            if (nums[i]==c){
                nums[i]=Integer.MAX_VALUE;
            }
            else{
                c=nums[i];
                t++;
            }
        }
        sort(nums);
        return t;

    }
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            insertLastElement(arr,i);
        }
    }
    public static void insertLastElement(int[] arr,int i){
        int item=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            arr[j]=item;
            j--;
        }
        arr[j + 1] = item;
    }
}