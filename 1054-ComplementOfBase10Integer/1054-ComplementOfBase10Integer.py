# Last updated: 8/19/2026, 10:37:37 AM
class Solution:
    def bitwiseComplement(self, n: int) -> int:
        x = 1
        while n > x: 
            x = x * 2 + 1
        return x - n