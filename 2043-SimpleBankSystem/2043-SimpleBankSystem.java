// Last updated: 8/20/2026, 12:59:03 AM
1class Bank {
2    long[] acc;
3    public Bank(long[] balance) {
4        this.acc=balance;
5    }
6    
7    public boolean transfer(int account1, int account2, long money) {
8        if(account1>acc.length || account2>acc.length) return false;
9        if(acc[account1-1]<money){
10            return false;
11        }
12        withdraw(account1,money);
13        deposit(account2,money);
14        return true;
15    }
16    
17    public boolean deposit(int account, long money) {
18        if(account>acc.length) return false;
19        acc[account-1]+=money;
20        return true;
21        
22    }
23    
24    public boolean withdraw(int account, long money) {
25        if(account>acc.length) return false;
26        if(acc[account-1]<money){
27            return false;
28        }
29        acc[account-1]-=money;
30        return true;
31    }
32}
33
34/**
35 * Your Bank object will be instantiated and called as such:
36 * Bank obj = new Bank(balance);
37 * boolean param_1 = obj.transfer(account1,account2,money);
38 * boolean param_2 = obj.deposit(account,money);
39 * boolean param_3 = obj.withdraw(account,money);
40 */