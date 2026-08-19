# Last updated: 8/19/2026, 10:37:10 AM
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxi=0
        maxii=0
        for i in range(len(nums)):
            if nums[i]>maxi:
                maxii=maxi
                maxi=nums[i]
            elif nums[i]>maxii:
                maxii=nums[i]
        return (maxi-1)*(maxii-1)
        
    
