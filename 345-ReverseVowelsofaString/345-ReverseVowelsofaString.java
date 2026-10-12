// Last updated: 10/12/2026, 10:18:56 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[] arr=s.toCharArray();
4        int left=0,right=arr.length-1;
5        String vowels="aeiouAEIOU";
6        while(left<right){
7            while(left<right && vowels.indexOf(arr[left])==-1) left++;
8            while(left<right && vowels.indexOf(arr[right])==-1) right--;
9            char temp=arr[left];
10            arr[left]=arr[right];
11            arr[right]=temp;
12            left++;
13            right--;
14        }
15        return new String(arr);
16    }
17}