// Last updated: 31/07/2025, 19:32:30
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        int i=0;
        int j=hours.length-1;
        while(i<j){
            if(hours[i]>=target){
                c++;
            }
            if(hours[j]>=target){
                c++;
            }
            i++;
            j--;
        }
        if(!(hours.length%2==0) && hours[hours.length/2]>=target){
            c++;
        }
        return c;
    }
}