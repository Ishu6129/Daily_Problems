// Last updated: 31/07/2025, 19:33:07
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] s_new= s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(Character.isLetter(s_new[i]) && Character.isLetter(s_new[j])){
                char temp=s_new[i];
                s_new[i]=s_new[j];
                s_new[j]=temp;
                i++;
                j--;
            }
            else if(!Character.isLetter(s_new[i])){
                i++;
            }
            else if(!Character.isLetter(s_new[j])){
                j--;
            }
        }
        return new String(s_new);
    }
}