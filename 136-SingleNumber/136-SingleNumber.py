# Last updated: 8/19/2026, 10:40:34 AM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res = 0
        for i in nums:
            res =res ^ i
        return res
        