# Last updated: 8/21/2026, 1:15:47 PM
1class Solution:
2    def findKthSmallest(self, coins: List[int], k: int) -> int:    
3        def check(m):
4            tot = 0
5            for x in range(1, len(coins) + 1):
6                for c in combinations(coins, x):
7                    tot += m // lcm(*c) * pow(-1, x + 1)
8            return tot >= k
9    
10        return bisect_left(range(k * coins[0] + 1), True, lo=1, key=check)