// Last updated: 9/11/2026, 9:34:40 AM
1class Solution {
2    public int[] findEvenNumbers(int[] digits) {
3        int n = digits.length;
4        Set<Integer> set = IntStream.range(0, n).boxed()
5            .flatMap(i -> IntStream.range(0, n).boxed()
6                .filter(j -> j != i)
7                .flatMap(j -> IntStream.range(0, n).boxed()
8                    .filter(k -> k != i && k != j)
9                    .map(k -> (digits[i] * 10 + digits[j]) * 10 + digits[k])))
10            .filter(num -> num > 99 && (num & 1) == 0)
11            .collect(Collectors.toSet()); 
12        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
13    }
14}