// Last updated: 31/07/2025, 19:33:58
class Solution {
    public int addDigits(int num) {
        int[] arr={0,Integer.MAX_VALUE};
        if (num>=0 && num<10 ){
            return num;
        }
        while(!(arr[1]==1)){
            cnt(arr,num);
            num=arr[0];
        }
        return num;
    }
    public static void cnt(int[] arr,int n){
        int c=0;
        int s=0;
        int temp=n;
        while(temp>0){
            c=c+1;
            s=s+(temp%10);
            temp=temp/10;
        }
        arr[0]=s;
        arr[1]=c;
    }
}