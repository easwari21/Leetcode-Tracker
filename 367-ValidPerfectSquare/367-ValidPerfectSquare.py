# Last updated: 8/19/2026, 10:39:12 AM
class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        low,high=1,num
        while low<=high:
            mid=(low+high)//2
            if mid*mid==num:
                return True
            elif mid*mid>num:
                high = mid-1
            else:
                low=mid+1
        return False
