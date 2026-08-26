# Last updated: 8/26/2026, 1:57:11 PM
1class Solution:
2    def shortestBeautifulSubstring(self, s: str, k: int) -> str:
3        ans = ""
4        n = len(s)
5        for i in range(n):
6            oneCnt = 0
7            cur = ""
8            for j in range(i, n):
9                cur += s[j]
10                if s[j] == '1':
11                    oneCnt += 1
12                if oneCnt > k:
13                    break
14                if oneCnt == k:
15                    if ans == "" or len(cur) < len(ans) or (len(cur) == len(ans) and cur < ans):
16                        ans = cur
17
18        return ans