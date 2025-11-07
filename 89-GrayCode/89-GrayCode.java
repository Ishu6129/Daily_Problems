// Last updated: 07/11/2025, 22:25:47
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
       for (int i = pre.size() - 1; i >= 0; i--) {
            String bin = Integer.toBinaryString(pre.get(i));
            bin = String.format("%" + (n-1) + "s", bin).replace(' ', '0');
            ans.add(Integer.valueOf("1" + bin, 2));
        }
       return ans;
    }
}