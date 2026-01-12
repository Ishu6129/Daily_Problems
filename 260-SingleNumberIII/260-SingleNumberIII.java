// Last updated: 13/01/2026, 01:53:30
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int ans=0;
4        for(int i=0;i<nums.length;i++){
5            ans^=nums[i];
6        }
7        int n=ans;
8        int pos=0;
9        while(n!=0){
10            if((n&1)!= 0){
11                break;
12            }
13            pos++;
14            n=n>>1;
15        }
16        int a=0;
17        int b=0;
18        for(int i=0;i<nums.length;i++){
19            if( (nums[i]&(1<<pos))==0 ){
20                a^=nums[i];
21            }
22            else{
23                b^=nums[i];
24            }
25        }
26        return new int[]{a,b};
27    }
28}