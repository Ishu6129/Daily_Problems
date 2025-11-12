// Last updated: 12/11/2025, 18:18:03
class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] ans=new String[(s.length()+k-1)/k];
        int idx=0;
        for(int i=0;i<ans.length;i++){
            String str="";
            for(int j=0;j<k;j++){
                if(idx<s.length()){
                    str+=s.charAt(idx++);
                }
                else{
                    str+=fill;
                }
            }
            ans[i]=str;
        }
        return ans;
    }
}