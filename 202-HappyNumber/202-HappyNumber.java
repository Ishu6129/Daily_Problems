// Last updated: 16/08/2025, 19:39:38
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            int t=n;
            int sm=0;
            while(t>0){
                int r=t%10;
                sm=sm+(r*r);
                t=t/10;
            }
            n=sm;
            if(n==1) return true;
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
            }
        }
    }
    public int sum(int n){
        int t=n;
        int sm=0;
        while(t>0){
            int r=t%10;
            sm=sm+(r*r);
            t=t/10;
        }
        return sm;
    }
}