// Last updated: 29/03/2026, 00:42:58
1class Solution {
2    public String findTheString(int[][] lcp) {
3        int n=lcp.length;
4        for(int i=0;i<n;i++){
5            if(lcp[i][i]!=(n-i)) return "";
6            for(int j=i;j<n;j++){
7                if(lcp[i][j]!=lcp[j][i] || lcp[i][j]>(n-j) ) return "";
8            }
9        }
10        StringBuilder sb=new StringBuilder("");
11        for(int i=0;i<n;i++){
12            sb.append("#");
13        }
14        Set<Integer> indexes=new HashSet<>();
15        int c=0;
16        for(int i=0;i<n;i++){
17            if (sb.charAt(i)!='#') continue;
18            if (c == 26) return "";
19            for(int j=i;j<n;j++){
20                if (lcp[i][j] > 0) {
21                    sb.setCharAt(j,(char)(97 + c));
22                }
23            }
24            c++;
25        }
26        int[][] check=new int[n][n];
27        for (int i =n-1;i>=0;i--) {
28            for (int j=n-1;j>=i;j--){
29                if (sb.charAt(i)==sb.charAt(j)) {
30                    check[i][j]=1+( ((i+1)<n && (j+1)<n)?check[i+1][j+1]:0);
31                    check[j][i]=check[i][j];
32                }
33            }
34        }
35        for(int i=0;i<n;i++){
36            if(!Arrays.equals(check[i],lcp[i])) return "";
37        }
38        return sb.toString();
39    }
40}