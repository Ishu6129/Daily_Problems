// Last updated: 09/03/2026, 11:48:08
1class Solution {
2    public int minimumPairRemoval(int[] nums) {
3        ArrayList<Integer> arr = new ArrayList<>();
4        for (int num : nums) {
5            arr.add(num);
6        }
7        if(check(arr)) return 0;
8        int ans=0;
9        while(arr.size()>0){
10            int[] fnd={-1,Integer.MAX_VALUE};
11            for(int i=0;i<arr.size()-1;i++){
12                int sum=arr.get(i)+arr.get(i+1);
13                if(sum<fnd[1]){
14                    fnd[0]=i;
15                    fnd[1]=sum;
16                }
17            }
18            arr.remove(fnd[0]);
19            arr.remove(fnd[0]);
20            arr.add(fnd[0],fnd[1]);
21            ans++;
22            if(check(arr)) return ans;
23        }
24        return 0;
25    }
26    public boolean check(ArrayList<Integer> arr){
27        for(int i=0;i<arr.size()-1;i++){
28            if(arr.get(i)>arr.get(i+1)) return false;
29        }
30        return true;
31    }
32}