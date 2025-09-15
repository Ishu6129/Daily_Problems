// Last updated: 15/09/2025, 23:47:57
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Map<Character, Boolean> map = new HashMap<>();
        for (char ch : brokenLetters.toCharArray()) {
            map.put(ch, true);
        }
        String[] arr = text.split(" ");
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean ctp = true;
            for (char ch : arr[i].toCharArray()) {
                if (map.containsKey(ch)) {
                    ctp = false;
                    break;
                }
            }
            if (ctp) c++;
        }
        return c;
    }
}
