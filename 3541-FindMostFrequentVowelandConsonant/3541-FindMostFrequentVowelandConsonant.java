// Last updated: 13/09/2025, 12:38:52
class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());
        int sum=0;
        for (int i = 0; i < sortedList.size(); i++) {
            char ch = sortedList.get(i).getKey();
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sum += sortedList.get(i).getValue();
                break;
            }
        }
        for (int i = 0; i < sortedList.size(); i++) {
            char ch = sortedList.get(i).getKey();
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sum += sortedList.get(i).getValue();
                break;
            }
        }
        return sum;
    }
}