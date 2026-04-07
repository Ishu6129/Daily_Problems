// Last updated: 07/04/2026, 15:44:13
1class Solution {
2    public int gcd(int a,int b){
3        if(b==0) return a;
4        return gcd(b,a%b);
5    }
6    public List<String> simplifiedFractions(int n) {
7        List<String> ans=new ArrayList<>();
8        for(int i=1;i<n;i++){
9            for(int j=2;j<=n;j++){
10                if(i==j || i>j || gcd(i,j)>1) continue;
11                ans.add(i+"/"+j);
12            }
13        }
14        return ans;
15    }
16}