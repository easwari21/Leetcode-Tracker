# Last updated: 8/19/2026, 10:39:15 AM
class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        if n==0:
            return 1
        target =10
        prod = 9
        for x in range(2,n+1):
            target+=prod * (11-x)
            prod*=11-x
        return target