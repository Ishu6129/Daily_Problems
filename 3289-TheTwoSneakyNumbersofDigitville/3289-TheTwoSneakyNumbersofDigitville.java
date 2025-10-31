// Last updated: 31/10/2025, 19:32:09
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int[] arr=new int[2];
        arr[0]=-1;arr[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                if(arr[0]==-1){
                    arr[0]=nums[i];
                }
                else if(arr[1]==-1){
                    arr[1]=nums[i];
                }
                else break;
            }
            else{
                s.add(nums[i]);
            }
        }
        if(arr[0]>arr[1]){
            int temp=arr[0];
            arr[0]=arr[1];
            arr[1]=temp;
        }
        return arr;
    }
}