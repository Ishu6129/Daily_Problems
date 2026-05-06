// Last updated: 5/6/2026, 2:13:51 PM
1class Solution {
2    int n;
3    int m;
4    public char[][] rotateTheBox(char[][] boxGrid) {
5        this.n=boxGrid.length;
6        this.m=boxGrid[0].length;
7        for(int i=0;i<n;i++){
8            int j=m-1;
9            while(j>=0){
10                int temp=j;
11                int c=0;
12                while(temp>=0 && boxGrid[i][temp]!='*'){
13                    if( boxGrid[i][temp]=='#') c++;
14                    temp--;
15                }
16                while(j!=temp){
17                    if(c!=0){
18                        boxGrid[i][j]='#';
19                        c--;
20                    }
21                    else if(boxGrid[i][j]=='#'){
22                        boxGrid[i][j]='.';
23                    }
24                    j--;
25                }
26                j--;
27            }
28        }
29        return rotate(boxGrid);
30    }
31    public char[][] rotate(char[][] arr){
32        char[][] n_arr=new char[m][n];
33        for(int i=0;i<n;i++){
34            for(int j=0;j<m;j++){
35                n_arr[j][n-i-1]=arr[i][j];
36            }
37        }
38        return n_arr;
39    }
40}