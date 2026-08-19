# Last updated: 8/19/2026, 10:42:57 AM
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        n = {}
        for i, num in enumerate(nums):
            diff = target - num
            if diff in n:
                return [n[diff], i]
            n[num] = i

        