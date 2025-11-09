// Last updated: 09/11/2025, 10:40:00
class Solution {
    public int countOperations(int num1, int num2) {
        int ans=0;
        while(num1!=0 && num2!=0){
            if(num2>=num1){
                num2-=num1;
            }
            else{
                num1-=num2;
            }
            ans++;
        }
        return ans;
    }

}