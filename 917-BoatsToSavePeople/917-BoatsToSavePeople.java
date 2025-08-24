// Last updated: 24/08/2025, 22:48:09
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