// Last updated: 31/07/2025, 19:33:49
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        char temp=0;
        while(i<j){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}