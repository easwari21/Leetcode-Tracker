# Last updated: 9/6/2026, 12:15:28 PM
1class Solution:
2    def numDistinct(self, s: str, t: str) -> int:
3        m = len(s)
4        n = len(t)
5
6        if n > m:
7            return 0
8
9        dp = [0] * (n + 1)
10        dp[0] = 1
11
12        for i in range(m):
13            for j in range(n, 0, -1):
14                if s[i] == t[j - 1]:
15                    dp[j] += dp[j - 1]
16
17        return dp[n]