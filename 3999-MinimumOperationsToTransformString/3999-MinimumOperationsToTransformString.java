// Last updated: 12/10/2025, 00:53:00
class Solution {
    public int minOperations(String s) {
        int[] arr=new int[26];
        int opr=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']++;
        }
        for(int i=1;i<26;i++){
            if(arr[i]>0){
                opr=Math.max(opr,(26-i));
            }
        }
        return opr;
    }
}