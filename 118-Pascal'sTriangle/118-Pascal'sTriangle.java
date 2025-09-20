// Last updated: 20/09/2025, 21:12:28
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
         for (int i = 0; i < numRows; i++) {
            int number = 1;
            List<Integer> arr=new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                arr.add(number);
                number = number * (i - j) / (j + 1);
            }
            ans.add(arr);
        }
        return ans;
    }
}