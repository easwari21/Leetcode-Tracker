# Last updated: 8/19/2026, 10:40:31 AM
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
       count = 0
       majority = 0
       for i in range(len(nums)):
          if count==0 and majority!=nums[i]:
             majority = nums[i]
             count+=1
          elif majority == nums[i]:
              count+=1
          else:
             count-=1
       return majority
        
