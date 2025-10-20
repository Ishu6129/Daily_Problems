// Last updated: 20/10/2025, 12:50:32
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String s:operations){
            if(s.charAt(0)=='+') ++ans;
            else if(s.charAt(1)=='+') ans++;
            else if(s.charAt(0)=='-') --ans;
            else ans--;
        }
        return ans;
    }
}