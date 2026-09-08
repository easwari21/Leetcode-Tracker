# Last updated: 9/8/2026, 2:29:03 PM
1class Solution:
2    def countCommas(self, n: int) -> int:
3        c=0
4        if n<1000:
5            return 0
6        for i in range(1000,n+1):
7            if i>=1000:
8                c+=1
9        return c