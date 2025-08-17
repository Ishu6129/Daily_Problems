// Last updated: 17/08/2025, 21:51:32
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=-0;
        int j=people.length-1;
        int ans=0;
        while(i<j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            j--;
            ans++;
        }
        if(i==j) return ++ans;
        return ans;
    }
}