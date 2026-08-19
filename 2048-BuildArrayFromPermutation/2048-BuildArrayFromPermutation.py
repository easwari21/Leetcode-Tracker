# Last updated: 8/19/2026, 10:36:30 AM
class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        for i in range(len(nums)):
            return [nums[nums[i]] for i in range(len(nums))]
    