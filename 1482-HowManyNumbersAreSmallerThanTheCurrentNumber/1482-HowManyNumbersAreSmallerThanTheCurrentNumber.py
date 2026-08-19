# Last updated: 8/19/2026, 10:37:19 AM
class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        result = []
        num = sorted(nums)
        for i in nums:
            result.append(num.index(i))
        return result