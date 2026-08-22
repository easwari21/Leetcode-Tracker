# Last updated: 8/22/2026, 11:30:43 AM
1class Solution:
2    def checkDivisibility(self, n: int) -> bool:
3        add = 0
4        pro = 1
5        for i in str(abs(n)):
6            d = int(i)
7            add += d
8            pro *= d
9        if n % (add+pro) == 0:
10            return True
11        else:
12            return False