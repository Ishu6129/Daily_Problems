// Last updated: 12/10/2025, 00:52:47
class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> e1,Map.Entry<Character,Integer> e2){
                return e2.getValue().compareTo(e1.getValue());
            }
        });
        LinkedHashMap<Integer, List<Character>> freqGroups = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            int freq = entry.getValue();
            freqGroups.putIfAbsent(freq, new ArrayList<>());
            freqGroups.get(freq).add(entry.getKey());
        }
        int maxGroupSize = 0;
        int chosenFreq = 0;
        for (Map.Entry<Integer, List<Character>> entry : freqGroups.entrySet()) {
            int freq = entry.getKey();
            int size = entry.getValue().size();

            if (size > maxGroupSize || (size == maxGroupSize && freq > chosenFreq)) {
                maxGroupSize = size;
                chosenFreq = freq;
            }
        }
        List<Character> chosenGroup = freqGroups.get(chosenFreq);
        StringBuilder result = new StringBuilder();
        for (char ch : chosenGroup) {
            result.append(ch);
        }

        return result.toString();
    }
}