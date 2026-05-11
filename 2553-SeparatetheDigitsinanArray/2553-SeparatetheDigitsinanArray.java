// Last updated: 5/11/2026, 12:33:44 PM
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        List<Integer> ls=new ArrayList<>();
4        for(int i:nums){
5            int t=i;
6            List<Integer> temp=new ArrayList<>();
7            while(t>0){
8                int r=t%10;
9                temp.add(r);
10                t/=10;
11            }
12            Collections.reverse(temp);
13            ls.addAll(temp);
14        }
15        return ls.stream().mapToInt(Integer::intValue).toArray();
16    }
17}