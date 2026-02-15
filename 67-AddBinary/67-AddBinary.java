// Last updated: 15/02/2026, 16:01:23
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int a_len = a.length();
5        int b_len = b.length();
6        int l = Math.min(a_len, b_len);
7        int c = 0;
8
9        // Process common length
10        for (int i = 0; i < l; i++) {
11            char a_ch = a.charAt(a_len - i - 1);
12            char b_ch = b.charAt(b_len - i - 1);
13
14            if (a_ch == b_ch && a_ch == '0') {
15                if (c == 0) {
16                    sb.append('0');
17                } else {
18                    sb.append('1');
19                    c = 0;
20                }
21            } 
22            else if (a_ch == b_ch && a_ch == '1') {
23                if (c == 0) {
24                    sb.append('0');
25                } else {
26                    sb.append('1');
27                }
28                c = 1;
29            } 
30            else { // one is 0, one is 1
31                if (c == 0) {
32                    sb.append('1');
33                } else {
34                    sb.append('0');
35                    c = 1;
36                }
37            }
38        }
39
40        // Process remaining digits of longer string
41        if (a_len > b_len) {
42            for (int i = l; i < a_len; i++) {
43                char ch = a.charAt(a_len - i - 1);
44                if (c == 0) {
45                    sb.append(ch);
46                } else {
47                    if (ch == '0') {
48                        sb.append('1');
49                        c = 0;
50                    } else {
51                        sb.append('0');
52                        c = 1;
53                    }
54                }
55            }
56        } else {
57            for (int i = l; i < b_len; i++) {
58                char ch = b.charAt(b_len - i - 1);
59                if (c == 0) {
60                    sb.append(ch);
61                } else {
62                    if (ch == '0') {
63                        sb.append('1');
64                        c = 0;
65                    } else {
66                        sb.append('0');
67                        c = 1;
68                    }
69                }
70            }
71        }
72
73        // Final carry
74        if (c == 1) {
75            sb.append('1');
76        }
77
78        return sb.reverse().toString();
79    }
80}
81