// Last updated: 7/13/2026, 10:00:13 AM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<List<Integer>> ls=new ArrayList<>();
4        ls.add(Arrays.asList());
5        ls.add(Arrays.asList());
6        ls.add(Arrays.asList(12,23,34,45,56,67,78,89));
7        ls.add(Arrays.asList(123,234,345,456,567,678,789));
8        ls.add(Arrays.asList(1234,2345,3456,4567,5678,6789));
9        ls.add(Arrays.asList(12345,23456,34567,45678,56789));
10        ls.add(Arrays.asList(123456,234567,345678,456789));
11        ls.add(Arrays.asList(1234567,2345678,3456789));
12        ls.add(Arrays.asList(12345678,23456789));
13        ls.add(Arrays.asList(123456789));
14        int l1=(int)Math.log10(low)+1;
15        int l2=(int)Math.log10(high)+1;
16        List<Integer> ans=new ArrayList<>();
17        if(l2==10) l2=9;
18        while(l1<=l2){
19            List<Integer> list=ls.get(l1);
20            for(int i:list){
21                if(i>=low && i<=high){
22                    ans.add(i);
23                }
24            }
25            l1++;
26        }
27        return ans;
28    }
29}