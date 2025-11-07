// Last updated: 07/11/2025, 22:21:16
class Solution {
    public List<Integer> grayCode(int n) {
        if(n==1){
            List<Integer> ini=new ArrayList<>();
            ini.add(0);
            ini.add(1);
            return ini;
        }
       List<Integer> pre=grayCode(n-1);
       List<Integer> ans=new ArrayList<>();
       for(int i:pre){
            ans.add(i);
       }
       int add = 1 << (n - 1);
       for (int i = pre.size() - 1; i >= 0; i--) {
            ans.add(pre.get(i) | add);
        }
       return ans;
    }
}