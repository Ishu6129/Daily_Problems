// Last updated: 9/11/2026, 9:26:06 AM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int ans=0;
4        int n=digits.length;
5        Set<Integer> set=new HashSet<>();
6        for(int i=0;i<n;i++){
7            for(int j=0;j<n;j++){
8                for(int k=0;k<n;k++){
9                    if(i==j || j==k || k==i) continue;
10                    int num=((digits[i]*10+digits[j])*10+digits[k]);
11                    if(num>99 && !set.contains(num) && (num&1)!=1){
12                        ans++;
13                        set.add(num);
14                    }
15                }
16            }
17        }
18        return ans;
19    }
20}