// Last updated: 12/10/2025, 00:53:25
class Solution {
    public String sortVowels(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                pq.add(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                result.append(pq.poll());
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
