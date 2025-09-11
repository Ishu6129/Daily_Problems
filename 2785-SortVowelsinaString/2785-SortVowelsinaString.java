// Last updated: 11/09/2025, 18:27:09
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
