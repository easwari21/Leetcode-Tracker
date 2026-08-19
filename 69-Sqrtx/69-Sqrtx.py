# Last updated: 8/19/2026, 10:41:06 AM
class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 0:
            return 0  

        low, high = 1, x  
        while low <= high:
            mid = (low + high) // 2
            if mid * mid == x:
                return mid
            elif mid * mid > x:
                high = mid - 1
            else:
                low = mid + 1
        
        return high  