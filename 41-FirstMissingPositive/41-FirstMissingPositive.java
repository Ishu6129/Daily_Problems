// Last updated: 31/07/2025, 19:41:38
class Solution {
    public int firstMissingPositive(int[] arr) {
       int n=arr.length;
        for(int i=0;i<n;i++){
            while(1<=arr[i] && arr[i]<=n && arr[i]!=arr[arr[i]-1]){
                int temp=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[temp-1]=temp;
            }
            
        }
        for(int i=1;i<n+1;i++){
            if(i!=arr[i-1]){
                return i;
            }
        }
        return n+1;
    }
}