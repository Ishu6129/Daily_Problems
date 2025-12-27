// Last updated: 27/12/2025, 15:51:07
1class Solution {
2    public int countBeautifulPairs(int[] nums) {
3        int ans=0;
4        for(int i=0;i<nums.length;i++){
5            int first=fd(nums[i]);
6            for(int j=i+1;j<nums.length;j++){
7                if(gcd(first,nums[j]%10)==1) ans++;
8            }
9        }
10        return ans;
11    }
12    public int fd(int x) {
13        while(x>=10){
14            x/=10;
15        }
16        return x;
17    }
18    public int gcd(int a,int b) {
19        while(a!=0){
20            int temp=a;
21            a=b%a;
22            b=temp;
23        }
24        return b;
25    }
26}