// Last updated: 8/27/2026, 1:05:03 PM
1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int[] freq = new int[26];
4        for (char ch : s.toCharArray()) {
5            freq[ch-'a']++;
6        }
7        StringBuilder sb = new StringBuilder();
8        int n = s.length();
9        for (int i=0;i<n;i++) {
10            char ch=target.charAt(i);
11            if(freq[ch-'a']!=0) {
12                sb.append(ch);
13                freq[ch-'a']--;
14                continue;
15            }
16            int st=ch-'a'+1;
17            for (int j=st;j<26;j++) {
18                if (freq[j]!= 0) {
19                    sb.append((char) ('a'+j));
20                    freq[j]--;
21                    for (int k=0;k<26; k++) {
22                        while (freq[k]!= 0) {
23                            sb.append((char)('a'+k));
24                            freq[k]--;
25                        }
26                    }
27                    return sb.toString();
28                }
29            }
30            break;
31        }
32        for (int i=sb.length()-1;i>=0;i--) {
33            int curr=sb.charAt(i)-'a';
34            freq[curr]++;
35            for (int j=curr+1;j<26;j++) {
36                if (freq[j]!=0) {
37                    StringBuilder ans = new StringBuilder();
38                    ans.append(sb.substring(0,i));
39                    ans.append((char)('a'+j));
40                    freq[j]--;
41                    for (int k=0;k<26;k++) {
42                        while (freq[k]!=0) {
43                            ans.append((char) ('a'+k));
44                            freq[k]--;
45                        }
46                    }
47                    return ans.toString();
48                }
49            }
50        }
51        return "";
52    }
53}