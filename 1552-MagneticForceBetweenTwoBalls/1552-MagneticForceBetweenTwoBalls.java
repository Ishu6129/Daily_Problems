// Last updated: 30/09/2025, 17:49:32
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int i=0;
        int j=position[position.length-1];
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(check(position,mid,m)){
                ans=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
    public boolean check(int[] arr,int mid,int m){
        int c=1;
        int st=arr[0];
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-st)>=mid){
                c++;
                st=arr[i];
            }
            if(c==m) return true;
        }
        return false;
    }
}