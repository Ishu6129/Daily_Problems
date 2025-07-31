// Last updated: 31/07/2025, 19:34:31
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int temp=0;
        while(i<=j){
            temp=numbers[i]+numbers[j];
            if(temp==target){
                return new int[]{i+1,j+1};
            }
            else if(temp<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[0];
    }
}