# Last updated: 8/29/2026, 6:45:55 PM
1class Solution:
2    def lexicographicallySmallestArray(self, nums, limit):
3        n = len(nums)
4
5        sorted_nums = sorted(nums)
6        num_to_group = {}
7        group_to_nums = {}
8
9        group = 0
10
11        num_to_group[sorted_nums[0]] = group
12        group_to_nums[group] = [sorted_nums[0]]
13
14        for i in range(1, n):
15            if sorted_nums[i] - sorted_nums[i - 1] > limit:
16                group += 1
17
18            num_to_group[sorted_nums[i]] = group
19
20            if group not in group_to_nums:
21                group_to_nums[group] = []
22
23            group_to_nums[group].append(sorted_nums[i])
24        pointers = {g: 0 for g in group_to_nums}
25
26        result = [0] * n
27
28        for i in range(n):
29            g = num_to_group[nums[i]]
30
31            result[i] = group_to_nums[g][pointers[g]]
32            pointers[g] += 1
33
34        return result