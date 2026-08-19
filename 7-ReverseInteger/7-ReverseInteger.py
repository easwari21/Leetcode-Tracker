# Last updated: 8/19/2026, 10:42:46 AM
class Solution:
    def reverse(self, x: int) -> int:
        if x>0:
            ans=int(str(x)[::-1])
        else:
            ans=-int(str(-x)[::-1])
        if -2**31 <= ans <= 2**31 - 1:
            return ans
        else:
            return 0
    
    
    