// Last updated: 17/03/2026, 23:24:09
1class Solution {
2    public boolean hasGroupsSizeX(int[] deck) {
3        int[] arr=new int[(int)1e4+1];
4        for(int i:deck){
5            arr[i]++;
6        }
7        boolean flag=false;
8        int num=-1;
9        int min = Integer.MAX_VALUE;
10        for (int count : arr) {
11            if(count==1) return false;
12            if (count > 0 && count!=0) {
13                min = Math.min(min, count);
14            }
15        }
16        for (int x = 2; x <= min; x++) {
17            boolean valid = true;
18            for (int count : arr) {
19                if (count > 0 && count % x != 0) {
20                    valid = false;
21                    break;
22                }
23            }
24            if (valid) return true;
25        }
26        return false;
27
28    }
29}