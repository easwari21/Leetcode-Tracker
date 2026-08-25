# Last updated: 8/25/2026, 8:54:18 AM
1class Solution:
2    def missingMultiple(self, nums: List[int], k: int) -> int:
3        hasQ, qMax=0, 0
4        for x in nums:
5            q, r=divmod(x, k)
6            if r==0:
7                hasQ|=(1<<q)
8                qMax=max(q, qMax)
9        for q in range(1, qMax+1):
10            if (hasQ>>q)&1==0:
11                return q*k
12        return (qMax+1)*k