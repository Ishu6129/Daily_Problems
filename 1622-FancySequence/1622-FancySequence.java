// Last updated: 15/03/2026, 21:18:14
1class Fancy {
2    List<Long> arr;
3    long mul = 1;
4    long add = 0;
5    int mod = (int)1e9 + 7;
6    public Fancy() {
7        arr = new ArrayList<>();
8        add=0;
9        mul=1;
10    }
11
12    public void append(int val) {
13        long x=(long)val;
14        x= ( (x-add)+mod )%mod;
15        x= ( x*power(mul,mod-2) )%mod;
16        arr.add(x);
17    }
18
19    public void addAll(int inc) {
20        add = (add + inc) % mod;
21    }
22
23    public void multAll(int m) {
24        mul = (mul * m) % mod;
25        add = (add * m) % mod;
26    }
27
28    public int getIndex(int idx) {
29        if (idx >= arr.size()) return -1;
30        long val = arr.get(idx);
31        long res=((val*mul)%mod+add)%mod;
32        return (int)res;
33    }
34
35    public long power(long a, long b) {
36        long res = 1;
37        a %= mod;
38        while (b > 0) {
39            if ((b & 1) == 1) res = (res * a) % mod;
40            a = (a * a) % mod;
41            b >>= 1;
42        }
43        return res;
44    }
45}