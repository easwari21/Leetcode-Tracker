# Last updated: 8/24/2026, 8:21:36 AM
1class Solution:
2    def stoneGameVIII(self, stones: List[int]) -> int:
3        n = len(stones)
4        for i in range(1, n):
5            stones[i] += stones[i - 1]
6        best = stones[-1]
7        for i in range(n - 2, 0, -1):
8            best = max(best, stones[i] - best)
9        return best