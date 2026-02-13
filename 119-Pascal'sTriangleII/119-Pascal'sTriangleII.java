// Last updated: 13/02/2026, 19:38:18
1class Solution {
2    public List<Integer> getRow(int numRows) {
3        List<Integer> row = new ArrayList<>();
4        long number = 1;
5        for (int i = 0; i <= numRows; i++) {
6            row.add((int) number);
7            number = number * (numRows - i) / (i + 1);
8        }
9        
10        return row;
11    }
12}