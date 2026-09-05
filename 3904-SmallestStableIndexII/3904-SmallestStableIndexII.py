# Last updated: 9/5/2026, 12:49:07 PM
1class Solution:
2    def firstStableIndex(self, nums: list[int], k: int) -> int:
3        n = len(nums)
4        maxi = -10**9
5        mini = 10**9
6
7        right_mini = [0] * n
8
9        for idx in range(n - 1, -1, -1):
10            mini = min(mini, nums[idx])
11            right_mini[idx] = mini
12
13        for idx in range(n):
14            maxi = max(maxi, nums[idx])
15            score = maxi - right_mini[idx]
16
17            if score <= k:
18                return idx
19
20        return -1