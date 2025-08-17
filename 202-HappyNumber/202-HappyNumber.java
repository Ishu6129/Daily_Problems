// Last updated: 17/08/2025, 14:07:51
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
}