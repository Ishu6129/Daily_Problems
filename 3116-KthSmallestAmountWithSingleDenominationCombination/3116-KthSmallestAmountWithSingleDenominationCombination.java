// Last updated: 8/21/2026, 9:14:47 PM
1class Solution{
2    int[] coins;
3    int n;
4    long CountSmaller(long x){
5        long ans=0;
6        for(int mask=1;mask<(1<<n);mask++){
7            long lcm=0;
8            int cnt=0;
9            for(int i=0;i<n;i++){
10                if((mask&(1<<i))!=0){
11                    cnt++;
12                    if(lcm==0) lcm=coins[i];
13                    else lcm=lcm*coins[i]/gcd(lcm,coins[i]);
14                }
15            }
16            if(cnt%2==0) ans-=x/lcm;
17            else ans+=x/lcm;
18        }
19        return ans;
20    }
21    long gcd(long a,long b){
22        while(b!=0){
23            long t=a%b;
24            a=b;
25            b=t;
26        }
27        return a;
28    }
29    public long findKthSmallest(int[] c,int k){
30        coins=c;
31        n=coins.length;
32        long l=1,r=(long)1e18;
33        while(l<r){
34            long m=l+(r-l)/2;
35            if(CountSmaller(m)>=k) r=m;
36            else l=m+1;
37        }
38        return l;
39    }
40}