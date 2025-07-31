// Last updated: 31/07/2025, 19:32:39
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            max=Math.max(max,sentences[i].split(" ").length);
        }
        return max;
    }
}