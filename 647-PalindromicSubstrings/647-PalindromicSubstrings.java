// Last updated: 31/07/2025, 19:34:18
class Solution {
    private int c = 0; 

    public int countSubstrings(String s) {
        int a = 0;
        int b = 0;
        if(s.length()==1){
            return 1;
        }
        sub(s, s.length(), a, b);
        return c;
    }

    public void sub(String s, int n, int a, int b){
        if (a == n - 1) {
            return;
        }
        if (b == n) {
            a++;
            b = a;
        }
        b++;
        if (ispalindrome(s.substring(a, b))) {
            c++;
        }
        sub(s, n, a, b); 
    }

    public static boolean ispalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
