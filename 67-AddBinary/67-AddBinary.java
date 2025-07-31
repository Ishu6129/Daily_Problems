// Last updated: 31/07/2025, 19:40:51
class Solution {
    public String addBinary(String a, String b) {
      String ans="";
        int n=a.length()-1;
        int m=b.length()-1;
        if(m>n){
            return rmz(add(b,a,ans));
        }
        return rmz(add(a,b,ans));
    }
    public String add(String s1,String s2,String ans){
        int carry=0;
        int sum=0;
        int i=s1.length()-1;
        int j=s2.length()-1;
        while(j>=0){
            int temp=carry+(s1.charAt(i)-'0')+(s2.charAt(j)-'0');
            ans=((char)(temp%2+'0'))+ans;
            carry=temp/2;
            j--;i--;
        }
        while(i>=0){
            int temp=carry+(s1.charAt(i)-'0');
            ans=((char)(temp%2+'0'))+ans;
            carry=temp/2;
            i--;
        }
        if(carry==1){
            return "1"+ans;
        }
        return ans;
    }
    public String rmz(String s){
        int i=0;
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        return i==s.length()?"0":s.substring(i);
    }
}