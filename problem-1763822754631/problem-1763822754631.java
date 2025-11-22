// Last updated: 22/11/2025, 20:15:54
class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=wave(String.valueOf(i));
        }
        return ans;
    }
    public int wave(String s){
        int cnt=0;
        for(int i=1;i<s.length()-1;i++){
            if((s.charAt(i-1)>s.charAt(i) && 
               s.charAt(i+1)>s.charAt(i)) ||
               (s.charAt(i-1)<s.charAt(i) && 
               s.charAt(i+1)<s.charAt(i))
              ) cnt++;
        }
        return cnt;
    }
}