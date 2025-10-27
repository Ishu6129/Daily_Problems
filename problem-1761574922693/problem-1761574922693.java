// Last updated: 27/10/2025, 19:52:02
class Solution {
    public int numberOfBeams(String[] bank) {
        int i=0;
        int pre=0;
        while(i<bank.length){
            if(bank[i].indexOf('1') != -1){
                int cnt=0;
                for(int j=0;j<bank[i].length();j++){
                    if(bank[i].charAt(j)=='1') cnt++;
                }
                pre=cnt;
                break;
            }
            i++;
        }
        int sum=0;
        i++;
        while(i<bank.length){
            if(bank[i].indexOf('1') != -1){
                int cnt=0;
                for(int j=0;j<bank[i].length();j++){
                    if(bank[i].charAt(j)=='1') cnt++;
                }
                sum+=(pre*cnt);
                pre=cnt;
            }
            i++;
        }
        return sum;
    }
}