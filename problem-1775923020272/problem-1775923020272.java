// Last updated: 11/04/2026, 21:27:00
1class Solution {
2    public boolean[] sieve(int n){
3        boolean[] bans=new boolean[n+1];
4        Arrays.fill(bans,true);
5        bans[0]=false;
6        bans[1]=false;
7        for(int i=2;i*i<=n;i++){
8            for(int j=i*i;j<=n;j+=i){
9                bans[j]=false;
10            }
11        }
12        return bans;
13    } 
14    public int minOperations(int[] nums) {
15        boolean[] bans=sieve(1_000_01);
16        int[] nextPrime=new int[1_000_02];
17        int ptr=1_000_03;
18        for(int j=1_000_01;j>=0;j--){
19            if(bans[j]){
20                ptr=j;
21            }
22            nextPrime[j]=ptr-j;
23        }
24        int ans=0;
25        for(int i=0;i<nums.length;i++){
26            if(i%2==0){
27                ans+=nextPrime[nums[i]];
28            }
29            else{
30                if(bans[nums[i]]){
31                    int j=nums[i];
32                    while(bans[j]){
33                        j++;
34                    }
35                    ans+=(j-nums[i]);
36                }
37            }
38        }
39        return ans;
40    }
41}