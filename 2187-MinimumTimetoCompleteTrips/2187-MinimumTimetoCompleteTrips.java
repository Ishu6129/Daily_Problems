// Last updated: 26/09/2025, 22:11:17
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long left = 1;
        long right = (long) time[time.length - 1] * totalTrips;
        long ans=right;
        while(left<=right){
            long mid=left+(right-left)/2;
             if(check(time,mid,totalTrips)){
                ans=mid;
                right=mid-1;
             }
             else{
                left=mid+1;
             }
        }
        return ans;
    }
    public boolean check(int[] time,long mid,long target){
        long c=0;
        for(int i=0;i<time.length;i++){
            c=c+(mid/time[i]);
        }
        return c>=target?true:false;
    }

}