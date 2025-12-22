// Last updated: 22/12/2025, 16:51:43
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        Map<Integer, String[]> map = new HashMap<>();
4        for (int i = 0; i < indices.length; i++) {
5            int idx = indices[i];
6            if (idx + sources[i].length() <= s.length() &&
7                s.substring(idx, idx + sources[i].length()).equals(sources[i])) {
8                map.put(idx, new String[]{sources[i], targets[i]});
9            }
10        }
11        StringBuilder sb=new StringBuilder();
12        for(int i=0;i<s.length();i++){
13            if(!map.containsKey(i)){
14                sb.append(s.charAt(i));
15            }
16            else if(i+(map.get(i)[0]).length()<=s.length() && map.get(i)[0].equals(s.substring(i,i+(map.get(i)[0]).length()))){
17                sb.append(map.get(i)[1]);
18                i+=map.get(i)[0].length()-1;
19            }
20            else{
21                sb.append(s.charAt(i));
22            }
23        }
24        return sb.toString();
25    }
26}