// Last updated: 16/11/2025, 11:16:00
class Solution {
    public int numSub(String s) {
        long ans=0;
        long n=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                n++;
            }
            else{
                ans+=((n*(n+1))/2);
                n=0;
            }
        }
        if(n>0){
            ans+=(n*(n+1)/2);
        }
        return (int)(ans%(1e9+7));
    }
}