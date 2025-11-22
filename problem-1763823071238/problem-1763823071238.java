// Last updated: 22/11/2025, 20:21:11
class Solution {
    public int minimumFlips(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder sr=new StringBuilder(s);
        sr=sr.reverse();
        if(s.equals(sr.toString())) return 0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=sr.charAt(i)) ans++;
        }
        return ans;
    }
}