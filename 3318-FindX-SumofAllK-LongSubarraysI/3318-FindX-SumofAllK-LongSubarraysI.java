// Last updated: 06/11/2025, 20:10:00
class Solution {
    public String largestGoodInteger(String num) {
        String s="";
        for(int i=0;i<num.length()-2;i++){
            char a=num.charAt(i);
            char b=num.charAt(i+1);
            char c=num.charAt(i+2);
            if(a==b && b==c && c==a){
                if(s.length()==0 || s.charAt(0)<a){
                    s=a+"";
                }
            }
        }
        return (s.length()==0)?"":(s+""+s+""+s);
    }
}