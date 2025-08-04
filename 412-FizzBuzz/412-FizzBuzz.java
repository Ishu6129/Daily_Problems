// Last updated: 04/08/2025, 18:19:19
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ll=new ArrayList<>();
        int num3=1;
        int num5=1;
        String str="";
        int i=1;
        while(i<=n){
            if(num3==3){
                str=str+"Fizz";
                num3=0;
            }
            if(num5==5){
                str=str+"Buzz";
                num5=0;
            }
            if(str==""){
                ll.add(Integer.toString(i));
            }
            else{
                ll.add(str);
                str="";
            }
            num3++;
            num5++;
            i++;
        }
        return ll;
    }
}

