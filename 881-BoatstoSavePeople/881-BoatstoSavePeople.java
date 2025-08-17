// Last updated: 17/08/2025, 21:50:30
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=-0;
        int j=people.length-1;
        int ans=0;
        while(i<j){
            if(people[i]+people[j]<=limit){
                ans++;
                i++;
                j--;
            }
            else{
                ans++;
                j--;
            }
        }
        if(i==j) return ++ans;
        return ans;
    }
}