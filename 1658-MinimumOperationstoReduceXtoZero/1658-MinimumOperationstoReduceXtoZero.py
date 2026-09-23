# Last updated: 9/23/2026, 11:25:28 AM
1class Solution:
2    def minOperations(self, nums, x):
3        n = len(nums)
4        s = sum(nums)
5
6        t = s - x
7
8        if t == 0:
9            return n
10
11        if t < 0:
12            return -1
13
14        l = 0
15        w = 0
16        best = -1
17
18        for r in range(n):
19            w += nums[r]
20
21            while w > t:
22                w -= nums[l]
23                l += 1
24
25            if w == t:
26                best = max(best, r - l + 1)
27
28        return -1 if best == -1 else n - best