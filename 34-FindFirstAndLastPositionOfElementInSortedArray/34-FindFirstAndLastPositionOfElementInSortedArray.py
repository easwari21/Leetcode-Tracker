# Last updated: 8/19/2026, 10:42:01 AM
import bisect
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        left = bisect.bisect_left(nums, target)
        right = bisect.bisect_right(nums, target)

        if left < len(nums) and nums[left] == target:
            return [left, right - 1]

        else:
            return [-1, -1]