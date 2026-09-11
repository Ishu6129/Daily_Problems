// Last updated: 9/11/2026, 9:33:17 AM
1class Solution {
2    public int[] findEvenNumbers(int[] digits) {
3        int n=digits.length;
4        Set<Integer> set=new HashSet<>();
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                for(int k=0;k<n;k++){
8                    if(i==j || j==k || k==i) continue;
9                    int num=((digits[i]*10+digits[j])*10+digits[k]);
10                    if(num>99 && !set.contains(num) && (num&1)!=1){
11                        set.add(num);
12                    }
13                }
14            }
15        }
16        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
17    }
18}