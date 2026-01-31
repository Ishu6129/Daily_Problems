// Last updated: 31/01/2026, 18:39:33
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        for(char c:letters) {
4            if(c>target){
5                return c;
6            }
7        }
8        return letters[0];
9
10    }
11}