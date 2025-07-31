// Last updated: 31/07/2025, 19:40:55
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.strip();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                return c;
            }
            else{
                c++;
            }
        }
        return c;
    }
}