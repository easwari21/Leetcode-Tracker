# Last updated: 8/19/2026, 10:42:41 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)
        n=x[::-1]
        if x == n:
            return True
        else:
            return False