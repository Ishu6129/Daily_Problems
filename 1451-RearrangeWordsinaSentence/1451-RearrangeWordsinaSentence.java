// Last updated: 23/12/2025, 11:43:35
1class Solution {
2    public String arrangeWords(String text) {
3        String[] arr=text.toLowerCase().strip().split(" ");
4        Arrays.sort(arr,(a,b)->a.length()-b.length());
5        String ans=String.join(" ",arr);
6        return (ans.charAt(0)+"").toUpperCase()+ans.substring(1);
7    }
8}