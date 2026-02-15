// Last updated: 15/02/2026, 16:01:34
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int a_len = a.length();
5        int b_len = b.length();
6        int l = Math.min(a_len, b_len);
7        int c = 0;
8        for (int i = 0; i < l; i++) {
9            char a_ch=a.charAt(a_len-i-1);
10            char b_ch=b.charAt(b_len-i-1);
11            if (a_ch==b_ch && a_ch=='0') {
12                if (c==0){
13                    sb.append('0');
14                } 
15                else{
16                    sb.append('1');
17                    c=0;
18                }
19            } 
20            else if(a_ch==b_ch && a_ch=='1') {
21                if (c == 0) {
22                    sb.append('0');
23                } else {
24                    sb.append('1');
25                }
26                c = 1;
27            } 
28            else { 
29                if (c == 0) {
30                    sb.append('1');
31                } else {
32                    sb.append('0');
33                    c = 1;
34                }
35            }
36        }
37        if (a_len > b_len) {
38            for (int i = l; i < a_len; i++) {
39                char ch = a.charAt(a_len - i - 1);
40                if (c == 0) {
41                    sb.append(ch);
42                } 
43                else{
44                    if (ch == '0') {
45                        sb.append('1');
46                        c = 0;
47                    } else {
48                        sb.append('0');
49                        c = 1;
50                    }
51                }
52            }
53        } 
54        else {
55            for (int i = l; i < b_len; i++) {
56                char ch = b.charAt(b_len - i - 1);
57                if (c == 0) {
58                    sb.append(ch);
59                } else {
60                    if (ch == '0') {
61                        sb.append('1');
62                        c = 0;
63                    } else {
64                        sb.append('0');
65                        c = 1;
66                    }
67                }
68            }
69        }
70        if (c == 1) {
71            sb.append('1');
72        }
73        return sb.reverse().toString();
74    }
75}
76