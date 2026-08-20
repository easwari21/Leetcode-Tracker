# Last updated: 8/20/2026, 10:16:53 AM
1class Solution:
2    def divideArray(self, nums: List[int]) -> bool:
3        counter = {}
4        for num in nums:
5            counter[num] = counter.get(num, 0) + 1
6        
7        for count in counter.values():
8            if count % 2 != 0:
9                return False
10        
11        return True