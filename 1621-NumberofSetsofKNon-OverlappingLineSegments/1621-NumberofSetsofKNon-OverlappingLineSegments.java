// Last updated: 9/16/2026, 1:18:28 PM
1class Solution {
2
3    private static final long MOD = 1_000_000_007L;
4
5    private long modPow(long base, long exp) {
6        long result = 1;
7
8        while (exp > 0) {
9            if ((exp & 1L) != 0) {
10                result = result * base % MOD;
11            }
12
13            base = base * base % MOD;
14            exp >>= 1;
15        }
16
17        return result;
18    }
19
20    public int numberOfSets(int n, int k) {
21        long N = n + k - 1L;
22        long R = 2L * k;
23
24        R = Math.min(R, N - R);
25
26        long numerator = 1;
27        long denominator = 1;
28
29        for (long i = 1; i <= R; i++) {
30            numerator = numerator * (N - R + i) % MOD;
31            denominator = denominator * i % MOD;
32        }
33
34        long inverseDenominator = modPow(denominator, MOD - 2);
35
36        return (int) (numerator * inverseDenominator % MOD);
37    }
38}