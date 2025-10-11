// Last updated: 12/10/2025, 00:53:43
class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && Character.toUpperCase(st.peek()) == Character.toUpperCase(ch)
                    && st.peek() != ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}
