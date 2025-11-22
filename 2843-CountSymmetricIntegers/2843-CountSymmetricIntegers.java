// Last updated: 22/11/2025, 15:36:26
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        int i=low;
        if(low<10){
            low=11;
        }
        int ans=0;
        for(;i<=high;i++){
            if(check(i)) ans++;
        }
        return ans;
    }
    public boolean check(int num){
        String s=String.valueOf(num);
        if(s.length()%2!=0) return false;
        int sum=0;
        for(int i=0;i<s.length()/2;i++){
            sum+=(s.charAt(i)-'0');
        }
        for(int i=s.length()/2;i<s.length();i++){
            sum-=(s.charAt(i)-'0');
        }
        return sum==0;
    }
}